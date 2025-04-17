package review_kawakubo;

public class ErrorCounter {

  private String[] statuses;

  public ErrorCounter(String[] statuses) {
    this.statuses = statuses;    
  }

	public int countError() {

    boolean isAuthorized = false;

		int error = 0;

		for(String status: statuses) {
			switch(status) {
				case "login":
					isAuthorized = true;
					break;
				case "logout":
					isAuthorized = false;
					break;
				case "private":
					if(!isAuthorized) {
						error++;
					}
					break;
			}
		}
		return error;
  }
}