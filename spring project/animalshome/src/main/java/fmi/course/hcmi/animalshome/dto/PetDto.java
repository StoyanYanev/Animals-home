package fmi.course.hcmi.animalshome.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
@Setter
public class PetDto {
    @NotNull
    private PetDetailsDto petDetailsDto;

    @NotNull
    private PetHabitsDto petHabitsDto;

    //    private User owner;

    @NotNull
    private List<PhotoDto> photoDtos;

    @Size(min = 20)//TODO add max validation
    @NotBlank
    private String petDescription;
}
