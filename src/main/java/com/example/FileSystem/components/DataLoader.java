package com.example.FileSystem.components;

import com.example.FileSystem.models.File;
import com.example.FileSystem.models.Folder;
import com.example.FileSystem.models.User;
import com.example.FileSystem.repository.FileRepository;
import com.example.FileSystem.repository.FolderRepository;
import com.example.FileSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.nio.file.Files;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;


    public DataLoader() {
    }
        public void run(ApplicationArguments args) {

        User mark = new User("Mark");
        userRepository.save(mark);

        User chris = new User("Chris");
        userRepository.save(chris);


        Folder hearts = new Folder("Hearts");
        folderRepository.save(hearts);

        Folder aberdeen = new Folder("Aberdeen");
        folderRepository.save(aberdeen);

        File team1 = new File("team1", ".py", 100);
        fileRepository.save(team1);

        File team2 = new File("team2", ".js", 75);
        fileRepository.save(team2);
        }

}
