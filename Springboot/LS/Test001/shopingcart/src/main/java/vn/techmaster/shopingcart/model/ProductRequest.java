package vn.techmaster.shopingcart.model;



import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest{
  private String name;
  private String manufacturer;
  private long price;
  private MultipartFile photo;
 
}
