package calistir2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Personel {
	private String adi;
	private String soyadi;
	private String email;
	private int yas;
}
