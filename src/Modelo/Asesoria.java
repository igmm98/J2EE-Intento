package Modelo;

public class Asesoria {
	
	private String rutClienteAsesoria = "yay";
	private String detalleAsesoria = "no"; 
	
	public Asesoria() {
		
	}
	
	public Asesoria (String rutClienteAsesoria, String detalleAsesoria)
	{
		this.rutClienteAsesoria = rutClienteAsesoria;
		this.detalleAsesoria = detalleAsesoria;
	}
	
	public String getRutClienteAsesoria() {
		return rutClienteAsesoria;
	}
	public String getDetalleAsesoria() {
		return detalleAsesoria;
	}
	
	public void setRutClienteAsesoria(String rutClienteAsesoria) {
		this.rutClienteAsesoria = rutClienteAsesoria;
	}
	public void setDetalleAsesoria(String detalleAsesoria) {
		this.detalleAsesoria = detalleAsesoria;
	}

	@Override
	public String toString() {
		return "Asesoria [rutClienteAsesoria=" + rutClienteAsesoria + ", detalleAsesoria=" + detalleAsesoria + "]";
	}
	

}
