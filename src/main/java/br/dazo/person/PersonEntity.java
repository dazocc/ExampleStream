package br.dazo.person;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class PersonEntity {

    private String name;

    private Integer age;

    private String cpf;

    private SexType sex;

    public PersonEntity(String name, Integer age, String cpf, SexType sex) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "br.dazo.person.PersonEntity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cpf='" + cpf + '\'' +
                ", sex=" + sex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonEntity that = (PersonEntity) o;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }
}
