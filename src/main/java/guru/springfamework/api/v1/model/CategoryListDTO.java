package guru.springfamework.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/*
Created by Joharry Correa 09/08/2018
 */
@Data
@AllArgsConstructor
public class CategoryListDTO {
    List<CategoryDTO> categories;

}
