package ru.denisqaa.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class Timer {
  private LocalDateTime currentDate = LocalDateTime.now();
}
