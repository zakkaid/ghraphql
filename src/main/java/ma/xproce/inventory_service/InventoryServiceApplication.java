package ma.xproce.inventory_service;

import ma.xproce.inventory_service.dao.entity.Creator;
import ma.xproce.inventory_service.dao.entity.Video;
import ma.xproce.inventory_service.dao.repository.CreatorRepository;
import ma.xproce.inventory_service.dao.repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner start(CreatorRepository creatorRepository, VideoRepository videoRepository) {
        return args -> {
            // Create a list of creators
            List<Creator> creators = List.of(
                    Creator.builder().name("John Doe").build(),
                    Creator.builder().name("Jane Smith").build()
            );

            // Save the creators to the repository
            creatorRepository.saveAll(creators);

            // Create a list of videos and associate with creators
            List<Video> videos = List.of(
                    Video.builder().name("Spring Boot Tutorial").creator(creators.get(0)).build(),
                    Video.builder().name("Java 101").creator(creators.get(1)).build()
            );

            // Save the videos to the repository
            videoRepository.saveAll(videos);
        };
    }
}

