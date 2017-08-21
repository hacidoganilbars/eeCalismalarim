package com.hacidoganilbars.main;

import com.hacidoganilbars.dao.DAO;
import com.hacidoganilbars.entity.Araba;
import com.hacidoganilbars.entity.Minibus;

public class Islem {

	public static void main(String[] args) {

		DAO dao = new DAO();
		dao.connection();

		Araba mercedes = new Araba();
		mercedes.setIsim("Mercedes");
		mercedes.setMarka("mrcds");
		mercedes.setSeriNo(1);
		dao.save(mercedes);

		// hata verdirir ayn� arabad�r hem id hem marka �ak���yor
		// Araba x = new Araba();
		// x.setIsim("Mercedes");
		// x.setMarka("mrcds");
		// x.setSeriNo(1);
		// dao.save(x);
		
		

		// hata verdirmez �retilen s�n�flar farkl� id ve marka ayn�
		// Minibus y = new Minibus();
		// y.setIsim("Mercedes");
		// y.setMarka("mrcds");
		// y.setSeriNo(1);
		// dao.save(y);

		Araba haciMurat = new Araba();
		haciMurat.setIsim("Hac� Murat");
		haciMurat.setMarka("hm");
		haciMurat.setSeriNo(2);
		dao.save(haciMurat);

		Araba ferrari = new Araba();
		ferrari.setIsim("Ferrari");
		ferrari.setMarka("frrr");
		ferrari.setSeriNo(3);
		dao.save(ferrari);

		Minibus minimercedes = new Minibus();
		minimercedes.setIsim("Mercedes");
		minimercedes.setMarka("mrcds");
		minimercedes.setSeriNo(4);
		dao.save(minimercedes);

		Minibus doc = new Minibus();
		doc.setIsim("Dodge");
		doc.setMarka("ddge");
		doc.setSeriNo(5);
		dao.save(doc);
	}

}
