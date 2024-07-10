package workshop.workshop5.subway.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 역 정보를 담는 엔티티
@Setter
@Getter
public class StationDto {

    private String id;
    private String name;
    private int location;

    public StationDto() {
    }

    public StationDto(String id, String name, int location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public StationDto(int userInput) {

    }

    @Override
    public String toString() {
        return "StationDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", location=" + location +
                '}';
    }
}
