package com.Movie_Project.Movie_Tickets.Util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;

@Component
public class CloudinaryHelper {

    @Value("${cloudinary.url}")
    private String url;

    private Cloudinary getCloudinary() {
        return new Cloudinary(url);
    }

    public String generateImageLink(MultipartFile file) {
        Map<String, Object> params = new HashMap<>();
        params.put("folder", "BMT-Movies");
        params.put("use_filename", true);

        try {
            return (String) getCloudinary()
                    .uploader()
                    .upload(file.getBytes(), params)
                    .get("url");
        } catch (IOException e) {
            e.printStackTrace();
            return "https://placehold.co/600x400/EEE/31343C";
        }
    }

    public String getTheaterImageLink(MultipartFile file) {
        Map<String, Object> params = new HashMap<>();
        params.put("folder", "BMT-Theater");
        params.put("use_filename", true);

        try {
            return (String) getCloudinary()
                    .uploader()
                    .upload(file.getBytes(), params)
                    .get("url");
        } catch (IOException e) {
            e.printStackTrace();
            return "https://placehold.co/600x400/EEE/31343C";
        }
    }

    public String saveTicketQr(byte[] qr) {
        Map<String, Object> params = new HashMap<>();
        params.put("folder", "BMT-Theater-QR");
        params.put("use_filename", true);

        try {
            return (String) getCloudinary()
                    .uploader()
                    .upload(qr, params)
                    .get("url");
        } catch (IOException e) {
            e.printStackTrace();
            return "https://placehold.co/600x400/EEE/31343C";
        }
    }
}