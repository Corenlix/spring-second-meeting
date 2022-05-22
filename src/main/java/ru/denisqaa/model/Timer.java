package ru.denisqaa.model;

import java.time.LocalDateTime;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Timer {
  private LocalDateTime currentDate = LocalDateTime.now();
}
