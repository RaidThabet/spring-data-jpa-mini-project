package com.raid.miniprojectjpa.models.embedded;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable // tell spring that this is an embedded entity
public class OrderId {

    private String username; // assuming username is unique
    private LocalDateTime orderDate;

}
