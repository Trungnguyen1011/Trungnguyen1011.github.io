package vn.techmaster.shopingcart.model;

import java.io.Serializable;
import java.util.Base64;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Products")
public class Product implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  private String manufacturer;
  private long price;

 @Column(columnDefinition="BLOB")
  private byte[] photo;

  public String getPhotoByte() {
    String imageBase64 = Base64.getEncoder().encodeToString(getPhoto());
    return imageBase64;
}
}
