//1 Definicion de paquete package

//2. Son los imports import => ahora mismo no tenemos ninguno

//3. Deficinion de la clase. Ejm. Class Mesa

//4. Atributos

//5. Metodos
//5.1 Constructores
//5.2 Getters & Setters
//5.3 Otros

package com.ipartek.formacion.nidea.pojo;

public class Mesa {
	// Constantes para aplicar
	public static final int PRECIO_PATA = 1;
	public static final int PRECIO_M2 = 5;
	public static final int PRECIO_MATERIAL_MADERA = 4;
	public static final int PRECIO_MATERIAL_ACERO = 6;
	public static final int PRECIO_MATERIAL_ALUMINIO = 5;
	public static final int PRECIO_MATERIAL_PLASTICO = 2;
	public static final int PRECIO_COLOR_CUSTOM = 23;
	public static final String PRECIO_COLOR_NAME_CUSTOM = "Custom";
	public static final String[] MATERIALES_LISTA = { "madera", "acero", "aluminio", "plastico" };
	public static final int[] MATERIALES_LISTA_CODIGO = { 1, 2, 3, 4 };
	public static final int MATERIAL_MADERA = 1;
	public static final int MATERIAL_ACERO = 2;
	public static final int MATERIAL_ALUMINIO = 3;
	public static final int MATERIAL_PLASTICO = 4;

	// Atributos de la Clase

	private int numeroPatas;
	private int dimension;
	private String color;
	private int material;
	private boolean custom;

	public static int getPrecioPata() {
		return PRECIO_PATA;
	}

	public static int getPrecioM2() {
		return PRECIO_M2;
	}

	public static int getPrecioMaterialMadera() {
		return PRECIO_MATERIAL_MADERA;
	}

	public static int getPrecioMaterialAcero() {
		return PRECIO_MATERIAL_ACERO;
	}

	public static int getPrecioMaterialAluminio() {
		return PRECIO_MATERIAL_ALUMINIO;
	}

	public static int getPrecioMaterialPlastico() {
		return PRECIO_MATERIAL_PLASTICO;
	}

	public static int getPrecioColorCustom() {
		return PRECIO_COLOR_CUSTOM;
	}

	public static String getPrecioColorNameCustom() {
		return PRECIO_COLOR_NAME_CUSTOM;
	}

	public static String[] getMaterialesLista() {
		return MATERIALES_LISTA;
	}

	public static int[] getMaterialesListaCodigo() {
		return MATERIALES_LISTA_CODIGO;
	}

	public static int getMaterialMadera() {
		return MATERIAL_MADERA;
	}

	public static int getMaterialAcero() {
		return MATERIAL_ACERO;
	}

	public static int getMaterialAluminio() {
		return MATERIAL_ALUMINIO;
	}

	public static int getMaterialPlastico() {
		return MATERIAL_PLASTICO;
	}

	public boolean isCustom() {
		return custom;
	}

	public void setCustom(boolean custom) {
		this.custom = custom;
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaterial() {
		return material;
	}

	public void setMaterial(int material) {
		this.material = material;
	}

	public Mesa() {
		super(); // Siempre se llama al constructor padre del objeto, en este caso Object
		this.numeroPatas = 4;
		this.color = "blanco";
		this.dimension = 1;
		this.material = MATERIAL_MADERA;
	}

	public Mesa(int numeroPatas) {
		this();
		this.numeroPatas = numeroPatas;

	}

	public Mesa(int numeroPatas, int dimension) {
		this();
		this.numeroPatas = numeroPatas;
		this.dimension = dimension;

	}

	public Mesa(int numeroPatas, int dimension, String color, int material) {
		this();// Llamar siempre al constructor por defeccto
		this.numeroPatas = numeroPatas;
		this.dimension = dimension;
		this.color = color;
		this.material = material;

	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = (numeroPatas <= 0) ? 1 : numeroPatas;
	}

	@Override
	public String toString() {
		return "Mesa [numeroPatas=" + numeroPatas + " Color=" + color + " material= " + material + " ]";
	}

	public int Suma() {

		int precio;
		int patas = getNumeroPatas();
		int dimension = getDimension();
		String color = getColor();
		int material = getMaterial();
		int precio_material;
		int precio_color;
		int precio_patas;
		int precio_dimension;
		int precio_total;
		precio_material = 0;
		if (material == 1) {
			precio_material = PRECIO_MATERIAL_MADERA;
		}
		if (material == 2) {
			precio_material = PRECIO_MATERIAL_ACERO;
		}

		if (material == 3) {
			precio_material = PRECIO_MATERIAL_ALUMINIO;
		}

		if (material == 4) {
			precio_material = PRECIO_MATERIAL_PLASTICO;
		}

		if (color == "custom") {
			precio_color = 23;

		} else {
			precio_color = 0;
		}

		precio_patas = patas * PRECIO_PATA;
		precio_dimension = dimension * PRECIO_M2;
		precio_total = precio_material + precio_color + precio_patas + precio_dimension;

		System.out.println(precio_total);
		return precio_total;
	}
}

// Scanner sc= New Scanner(System.in);
/*
 * System.out.printl("�Numero de patas"?); int patas = sc.nextInt();
 * 
 * System.out.printl("Numero de patas"); String color= sc.next();
 * 
 */
