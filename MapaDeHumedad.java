class MapaDeHumedad {
	
	private double humedadDelTerreno[][] = new double[100][];
	private double muestrasDeHumedad;
	private double medidaDelTerreno;
	private int vecesQueSeCalculoHumedad;
	

	public MapaDeHumedad(double base, double altura) {
		recorrerArray();

		medidaDelTerreno = 0.0;
		muestrasDeHumedad = 0.0;
		
		vecesQueSeCalculoHumedad = 0;
	}

	public void calcularHumedad(double base, double altura, double humedad) {
		if (medidasValidas(altura, base)) {
			humedadDelTerreno[(int) (base - 1)][(int) (altura - 1)] = humedad;
		} else {
			throw new Error("Inserte Valores De Medida Validos");
		}
		muestrasDeHumedad = humedad;
		vecesQueSeCalculoHumedad++;
	
	}
	
	public void calcularPromedioDeHumedadEnElTerreno(double base, double altura){
		int cantidadDeVecesQueSeCalculoLahumedad=0;
		double totalDeLasMuestrasDeHumedad=0.0;
		
		
	}

	public void buscarElMaximoDeHumedad(double base, double altura){
			double	valorMaximoDeHumedad = 0.0;
			for(double i = 0; i< humedadDelTerreno.length; i++){
				
			}
		
	}
	
	private void recorrerArray() {

		for (int i = 0; i < humedadDelTerreno.length; i++) {
			for (int j = 0; j < humedadDelTerreno[i].length; j++) {
				humedadDelTerreno[i][j] = 0.0;
			}
		}
	}

	private boolean medidasValidas(double base, double altura) {

		return ((base > 0) && (altura > 0));

	}
}
