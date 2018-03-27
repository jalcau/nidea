package com.ipartek.formacion.nidea.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ipartek.formacion.nidea.pojo.Material;

/**
 * Recuèra todos los materiales de la base de datos de datos por id descendente
 * 
 * @return ArrayList<Material> si no existen los registros new
 *         ArrayList<Materials>()
 * @author Curso
 *
 */
public class MaterialDAO {
	public ArrayList<Material> getAll() {
		ArrayList<Material> lista = new ArrayList<Material>();
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {
			final String URL = "jdbc:mysql://192.168.0.42/spoty?" + "user=alumno&password=alumno";
			con = DriverManager.getConnection(URL);
			String sql = "SELECT id,nombre, precio FROM material;";
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			Material m = null;
			while (rs.next()) {
				m = new Material();
				m.setId(rs.getInt("id"));
				m.setNombre(rs.getString("nombre"));
				m.setPrecio(rs.getInt("precio"));
				lista.add(m);

			}

			// TODO cerrar recursos abiertos[conexion, pst, rs]
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
				}

				rs.close();
				if (pst != null) {
				}
				pst.close();
				if (con != null) {
				}
				con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}

		return lista;
	}

}
