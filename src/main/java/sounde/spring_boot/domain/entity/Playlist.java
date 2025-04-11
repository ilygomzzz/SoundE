package sounde.spring_boot.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Playlist {
    private Long id;
    private String name;
    private String artist;
    private String artistImgPath;
    private LocalDate createDate;
    private String imgPath;
    private List<Song> songs;
}
