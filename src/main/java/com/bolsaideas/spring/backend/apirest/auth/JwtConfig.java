package com.bolsaideas.spring.backend.apirest.auth;

public class JwtConfig {
	
	public static final String SECRET_KEY = "alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVATE = "-----BEGIN RSA PRIVATE KEY-----\r\n"
			+ "MIIEogIBAAKCAQEA1x6NLg3hPKc07Ua4ynRp/gSzbEfK/frj5bsj0nr4KLS8VoNi\r\n"
			+ "Om0wJq0pLgaN1u56JK1sFXAYYRnZLE9xfkWvaFcMPR3dMsdR2kBlbByfm1/iA4pB\r\n"
			+ "gZB60aSWyXFgV5HaMBi2XQOchBxD4BQX7tfOMkALQCKmVJbX4hzUCtKJ+M/5jOyU\r\n"
			+ "8TjE00C/2V2bm7EyBm+nAlW/YAbVE751Z/xCpCRoUlphbjFDnQU+muU89MkTMgTO\r\n"
			+ "0qdD7n6rRQfT6o/yt5Dz0u1TJkqrT4IZO0IqH9vxK6zg/cJeC8l/s+QKo/Tu+1ku\r\n"
			+ "HeJu6wEF1AHvYmUB9MoyDhQNHEk8Huj9/D9JYwIDAQABAoIBACaEC9cRGSDY9zr8\r\n"
			+ "jJ2DFm8qvE1I1WmAAEnjpdhLuB7hrU74GyBG6HYkTtk0xzSSYkAq5M050sOf8yhh\r\n"
			+ "2Po4090kqMZQkIhE87zWBtLClTkmg7sKiAwAqFzc0TqkGBHVxXETG6Ovv9hPjz+R\r\n"
			+ "mW9kKEELAnirO4itsV2Et9pwM8/eaLn3UARfSxBcjeeHrZ1OeirE2G7uNTDLEU1C\r\n"
			+ "cY5TLTsKTwCq+qj3LcTsvsAa1c3Mz+/1gdHBeliDhVPuEW9PwXtEv5Vs/9Z0DH7D\r\n"
			+ "1fWOOgUACONnv49kFi6lfIt8evLQlIwLuGVUI5e7kDE6abfy+KaWDptv+E1ctEF4\r\n"
			+ "0xtx5nECgYEA9dcy1Dl6kGKnIFPFh27R6Drehy7bHazDkY3FwOhAz4RX0DmLukEC\r\n"
			+ "p5XDsKBBeAd21391APjP5mSoFdjAhlkQKqbnmKnMFouJJCbIpu1XCBbfmMkaPybN\r\n"
			+ "iZOjaRBsVq4BTS6BdCfGplvKf72Imu8sYci8aigIVFri3MY+KhhfZe8CgYEA4AJY\r\n"
			+ "iXDEBTxKmKtj3iKSl2SGc5B8rgbcEUsomOfTofBKvR7ql+flHS6wnCQ7WvhY3wvC\r\n"
			+ "8qZ/4JI4BYfH8xXQkvvjBYDokogVSMnba+dJnA1kPW54j8tFK1QSHytojXKJZb8M\r\n"
			+ "bS+8uo5Ffek2X/YmxC4AfXhhmU9c0zDDKasg580CgYB5gRX/LDV2fTvKz3yWVmBq\r\n"
			+ "ngXz3GWxwfyayO5PTLsTlX5tTLPRp2XvfCbO+jXBZDcJhVZH17GxVlh5C7sD66sA\r\n"
			+ "2aMnoexbzDVI595OGonkVqHGesZ9Jel6ML0YJWTWZoQAKJcU2L/m4wEvp3aH1OQj\r\n"
			+ "pDnzYbvULWNo6JY66fbkgwKBgFN6rFHz0yj8UfRZEquKiMSgcraIZt5XshVDxApP\r\n"
			+ "gn+7065s4hHgGnLonmph2jjJihz8/hZ9U/R1qSjuc+Yz//l2oyC+7G0HB5+LkhjB\r\n"
			+ "JZ5hIzT9gTJdFxbRirtQ6vKjd26SZugdvSBsupr0mQ3j5oh/eDFJ9l0yxS3y4xgZ\r\n"
			+ "LPcVAoGAOKFPIhuzjFd/AYKRFxvl8ELU1hHLGW6cvK1EtO22jfv1KFGPaUIcWha7\r\n"
			+ "4LcTotItwI1qZ/WKsP+aMnLZYuBDp03CgCX+D0vBb2cfi9exsQv6dkNsqnq992R1\r\n"
			+ "D+hawlK6EUinAe1xl5BPW3NKtKP9yS3cDifZVOrWrRQIJpGa4eU=\r\n"
			+ "-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLIC = "-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1x6NLg3hPKc07Ua4ynRp\r\n"
			+ "/gSzbEfK/frj5bsj0nr4KLS8VoNiOm0wJq0pLgaN1u56JK1sFXAYYRnZLE9xfkWv\r\n"
			+ "aFcMPR3dMsdR2kBlbByfm1/iA4pBgZB60aSWyXFgV5HaMBi2XQOchBxD4BQX7tfO\r\n"
			+ "MkALQCKmVJbX4hzUCtKJ+M/5jOyU8TjE00C/2V2bm7EyBm+nAlW/YAbVE751Z/xC\r\n"
			+ "pCRoUlphbjFDnQU+muU89MkTMgTO0qdD7n6rRQfT6o/yt5Dz0u1TJkqrT4IZO0Iq\r\n"
			+ "H9vxK6zg/cJeC8l/s+QKo/Tu+1kuHeJu6wEF1AHvYmUB9MoyDhQNHEk8Huj9/D9J\r\n"
			+ "YwIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";
}
