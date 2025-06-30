package study.db.v3;


//DB 테이블에서 읽어온 데이터를 저장하는 역할
//DTO (Data Transfer Object)
public class ProductDTO {
	@Override
	public String toString() {
		return "ProductDTO [p_code=" + p_code + ", p_name=" + p_name + ", p_price=" + p_price + "]";
	}

	int p_code;
	String p_name;
	int p_price;
	public ProductDTO() {}
	
	public ProductDTO(int p_code,String p_name,int p_price) {
		this.p_code = p_code;
		this.p_name = p_name;
		this.p_price = p_price;
	}

	public int getP_code() {
		return p_code;
	}

	public void setP_code(int p_code) {
		this.p_code = p_code;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_price() {
		return p_price;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

}
