package step2;

import java.time.LocalDate;
import java.time.Month;

public class TestPattern {

	public static void main(String[] args) {

		Person p1 = Person.builder()
                .firstName("FirstName")
                .lastName("LastName")
                .addressOne("금천구 가산동 월드메르비앙2차 KOSMO")
                .addressTwo("AddressTwo")
                .birthDate(LocalDate.of(1995, Month.APRIL, 13))
                .sex("male")
                .driverLicence(true)
                .married(true)
                .build();
		
		System.out.println(p1.getAddressOne());
	}
}
