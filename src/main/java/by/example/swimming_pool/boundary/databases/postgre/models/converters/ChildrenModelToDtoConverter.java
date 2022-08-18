package by.example.swimming_pool.boundary.databases.postgre.models.converters;

import by.example.swimming_pool.boundary.databases.postgre.models.dto.ChildrenDto;
import by.example.swimming_pool.boundary.databases.postgre.models.sportmens.Children;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ChildrenModelToDtoConverter implements Converter<ChildrenDto, Children> {
    @Override
    public Children convert(ChildrenDto source) {
        return new Children(
                source.getName(),
                source.getDateOfBirthday(),
                source.getResult());
    }
}
