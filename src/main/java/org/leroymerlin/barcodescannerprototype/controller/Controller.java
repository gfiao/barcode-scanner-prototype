package org.leroymerlin.barcodescannerprototype.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.BASE64Decoder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

@RestController
@AllArgsConstructor
public class Controller {

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @PostMapping(value = "/process")
    public String helloPost(@RequestBody String base64) throws IOException {
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] imageBytes = decoder.decodeBuffer(base64);

        ByteArrayInputStream bis = new ByteArrayInputStream(imageBytes);
        BufferedImage image = ImageIO.read(bis);
        bis.close();

        return "Resolution: " + image.getWidth() + "x" + image.getHeight();
    }

}
