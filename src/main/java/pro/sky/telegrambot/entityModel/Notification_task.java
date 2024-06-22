package pro.sky.telegrambot.entityModel;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@Entity
public class Notification_task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "chat_id", nullable = false)
    private Long chat_id;

    @Column(nullable = false)
    private String message;

    @Column(name = "dataTime", nullable = false)
    private LocalDateTime dataTime;

    public Notification_task(Long chat_id, String message, LocalDateTime dateTime) {
        this.chat_id = chat_id;
        this.message = message;
        this.dataTime = dateTime;
    }
}
