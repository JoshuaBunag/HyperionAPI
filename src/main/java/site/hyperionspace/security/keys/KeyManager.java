package site.hyperionspace.security.keys;


import com.nimbusds.jose.jwk.RSAKey;
import org.springframework.stereotype.Component;

import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.UUID;

@Component
public class KeyManager {
    public RSAKey rsaKey() {
        try {
            KeyPairGenerator genKey = KeyPairGenerator.getInstance("RSA");
            genKey.initialize(2048);
            var key = genKey.generateKeyPair();

            RSAPublicKey publicKey = (RSAPublicKey) key.getPublic();
            RSAPrivateKey privateKey = (RSAPrivateKey) key.getPrivate();

            return new RSAKey.Builder(publicKey).
                    privateKey(privateKey).
                    keyID(UUID.randomUUID().
                            toString()).build();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("No valid JWT KEY");
        }
    }
}
