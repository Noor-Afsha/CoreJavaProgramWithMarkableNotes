package WhyWeUseextends;

public class Vedio extends Media{
	
	private String palyVedio;
	private String pauseVedio;
	public String getPalyVedio() {
		return palyVedio;
	}
	public void setPalyVedio(String palyVedio) {
		this.palyVedio = palyVedio;
	}
	public String getPauseVedio() {
		return pauseVedio;
	}
	public void setPauseVedio(String pauseVedio) {
		this.pauseVedio = pauseVedio;
	}
	@Override
	public String toString() {
		return "Vedio [palyVedio=" + palyVedio + ", pauseVedio=" + pauseVedio + "]";
	}

}
