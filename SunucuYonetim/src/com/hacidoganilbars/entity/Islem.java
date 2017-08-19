package com.hacidoganilbars.entity;

public class Islem {
	public static void main(String[] args) {

		DAO dao = new DAO();
		dao.connection();

		Server server = new Server();
		server.setName("vektorel");
		server.setIp("10.0.4.100");
		dao.save(server);
	}

}
