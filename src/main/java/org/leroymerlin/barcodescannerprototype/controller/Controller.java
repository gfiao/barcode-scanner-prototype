package org.leroymerlin.barcodescannerprototype.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Base64;

@RestController
@AllArgsConstructor
public class Controller {

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @PostMapping(value = "/process")
    public String helloPost(@RequestBody Frame frame) throws IOException {
        BufferedImage image = null;
        try {
            byte[] bytes = Base64.getDecoder().decode(frame.getCapture().split(",")[1]);
            image = ImageIO.read(new ByteArrayInputStream(bytes));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Resolution: " + image.getWidth() + "x" + image.getHeight());
        return "Resolution: " + image.getWidth() + "x" + image.getHeight();
    }
}
