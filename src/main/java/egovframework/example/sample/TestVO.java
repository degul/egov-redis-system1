package egovframework.example.sample;

import java.io.Serializable;

public class TestVO implements Serializable {
 
    private static final long serialVersionUID = 1L;

    private String id;
    
    private String pw;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "TestVO [id=" + id + ", pw=" + pw + "]";
	}
    
    
}
    
