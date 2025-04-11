package sounde.spring_boot.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Duration;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Song {
    private Long id;
    private String name;
    private String artist;
    private String artistImgPath;
    private String duration;
    private LocalDate dateCreate;
    private String imgPath;

    public String setDuration(Long seconds) {
        long minutes = seconds/60;
        long remainingSeconds = seconds%60;

        return String.format("%02d:%02d",minutes,remainingSeconds);
    }
}
