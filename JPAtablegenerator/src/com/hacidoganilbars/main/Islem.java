package com.hacidoganilbars.main;

import com.hacidoganilbars.dao.DAO;
import com.hacidoganilbars.entity.DigerKisiler;
import com.hacidoganilbars.entity.Kisi;

public class Islem {

	public static void main(String[] args) {
		
		DAO dao=new DAO();
		dao.connection();
		
		Kisi kisi1=new Kisi();
		kisi1.setIsim("Doðan");
		dao.save(kisi1);
		
		Kisi kisi2=new Kisi();
		kisi2.setIsim("Hakan");
		dao.save(kisi2);
		
		Kisi kisi3=new Kisi();
		kisi3.setIsim("Harun");
		dao.save(kisi3);
		
		Kisi kisi4=new Kisi();
		kisi4.setIsim("Fatih");
		dao.save(kisi4);
		
		Kisi kisi5=new Kisi();
		kisi5.setIsim("Gökhan");
		dao.save(kisi5);
		
		
		
		DigerKisiler k1=new DigerKisiler();
		k1.setIsim("Ahmet");
		dao.save(k1);
		
		DigerKisiler k2=new DigerKisiler();
		k2.setIsim("Mehmet");
		dao.save(k2);
		
		DigerKisiler k3=new DigerKisiler();
		k3.setIsim("Veli");
		dao.save(k3);
		
		DigerKisiler k4=new DigerKisiler();
		k4.setIsim("Hüseyin");
		dao.save(k4);
		
		DigerKisiler k5=new DigerKisiler();
		k5.setIsim("Ramazan");
		dao.save(k5);
		
		
	}
}
