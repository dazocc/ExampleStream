import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class SexAge {

    private Integer age;

    private SexType sex;

    public SexAge(SexType sex, Integer age) {
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "SexAge{" +
                "age=" + age +
                ", sex=" + sex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SexAge sexAge = (SexAge) o;
        return Objects.equals(age, sexAge.age) &&
                sex == sexAge.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, sex);
    }
}
