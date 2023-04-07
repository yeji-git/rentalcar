package community;

public class Community {

	private int text_number;
	private String client_id;
	private String title;
	private String content;
	private String write_date;
	private String edit_date;
	
	public Community(int text_number, String client_id, String title, String content, String write_date, String edit_date) {
		this.text_number = text_number;
		this.client_id = client_id;
		this.title = title;
		this.content = content;
		this.write_date = write_date;
		this.edit_date = edit_date;
	}
	
	public Community(CommunityRequestDto communityDto) {
		this.text_number = communityDto.getText_number();
		this.client_id = communityDto.getClient_id();
		this.title = communityDto.getTitle();
		this.content = communityDto.getContent();
		this.write_date = communityDto.getWrite_date();
		this.edit_date = communityDto.getEdit_date();
	}

	public int getText_number() {
		return text_number;
	}

	public String getClient_id() {
		return client_id;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public String getWrite_date() {
		return write_date;
	}

	public String getEdit_date() {
		return edit_date;
	}
	
}
