package task4printingoffice.observerpattern;

public class NewspaperEdition {
  public final long issueNum;
  public final String title;

  @Override
  public String toString() {
    return "Newspaper issue #" + this.issueNum + ": " + this.title;
  }

  private NewspaperEdition(Builder builder) {
    this.issueNum = builder.issueNum;
    this.title = builder.title;
  }

  public static class Builder {
    private long issueNum;
    private String title;

    public Builder(long issueNum) {
      this.issueNum = issueNum;
    }

    public Builder buildTitle(String title) {
      this.title = title;
      return this;
    }

    public NewspaperEdition build() {
      return new NewspaperEdition(this);
    }
  }
}
