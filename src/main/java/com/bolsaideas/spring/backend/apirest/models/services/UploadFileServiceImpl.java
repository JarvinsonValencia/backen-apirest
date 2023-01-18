package com.bolsaideas.spring.backend.apirest.models.services;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
public class UploadFileServiceImpl implements IUploadFileService{
	
	private final Logger log = LoggerFactory.getLogger(UploadFileServiceImpl.class);
	private final static String DIRECTORIO_UPLOAD = "uploads";

	@Override
	public Resource upload(String imageName) throws MalformedURLException {
		Path filePath = getPath(imageName);
		log.info(filePath.toString());
		
		Resource resource = new UrlResource(filePath.toUri());
	
		
		if(!resource.exists() && !resource.isReadable()) {
			filePath = Paths.get("src/main/resources/static/images").resolve("notuser.png").toAbsolutePath();
			
			resource = new UrlResource(filePath.toUri());
		
			log.error("Error, no se pudo cargar la imagen: " + imageName);
		}
		return resource;
	}

	@Override
	public String copy(MultipartFile file) throws IOException {
		String nameFile = UUID.randomUUID().toString() + "_" + file.getOriginalFilename().replace(" ", "");
		Path filePath = getPath(nameFile);
		
		log.info(filePath.toString());
		
		Files.copy(file.getInputStream(), filePath);
		
		return nameFile;
	}

	@Override
	public boolean delete(String nameImage) {
		if(nameImage != null && nameImage.length() > 0) {
			Path previousImagePath = Paths.get("uploads").resolve(nameImage).toAbsolutePath();
			File previousImageFile = previousImagePath.toFile();
			if(previousImageFile.exists() && previousImageFile.canRead()) {
				previousImageFile.delete();
				return true;
			}
		}
		return false;
	}

	@Override
	public Path getPath(String imageName) {
		return Paths.get(DIRECTORIO_UPLOAD).resolve(imageName).toAbsolutePath();
	}

}
