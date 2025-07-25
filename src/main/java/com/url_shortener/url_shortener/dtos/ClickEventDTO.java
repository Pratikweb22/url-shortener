package com.url_shortener.url_shortener.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ClickEventDTO {
    private LocalDate clickDate;
    private Long count;

    public ClickEventDTO() {

    }

    public ClickEventDTO(LocalDate clickDate, Long count) {
        this.clickDate = clickDate;
        this.count = count;
    }

    public LocalDate getClickDate() {
        return clickDate;
    }

    public void setClickDate(LocalDate clickDate) {
        this.clickDate = clickDate;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
