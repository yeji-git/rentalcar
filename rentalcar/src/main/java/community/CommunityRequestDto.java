package community;

public class CommunityRequestDto {

	private int text_number;
	private String client_id;
	private String title;
	private String content;
	private String write_date;
	private String edit_date;
	
	public CommunityRequestDto(int text_number, String client_id, String title, String content, String write_date, String edit_date) {
		this.text_number = text_number;
		this.client_id = client_id;
		this.title = title;
		this.content = content;
		this.write_date = write_date;
		this.edit_date = edit_date;
	}

	public int getText_number() {
		return text_number;
	}

	public void setText_number(int text_number) {
		this.text_number = text_number;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWrite_date() {
		return write_date;
	}

	public void setWrite_date(String write_date) {
		this.write_date = write_date;
	}

	public String getEdit_date() {
		return edit_date;
	}

	public void setEdit_date(String edit_date) {
		this.edit_date = edit_date;
	}

}
