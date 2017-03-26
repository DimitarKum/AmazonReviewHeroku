package model;

import org.json.simple.JSONObject;

import java.util.Objects;

public class Review{
	// private String reviewerID;
	private final String asin;
	// private String reviewerName;
	// private String helpful;
	private final String reviewText;
	// private String overall;
	private final double overall;
	private final String summary;
	// private String unixReviewTime;
	// private String reviewTime;

	// Sample review:
	// "reviewerID": "A2SUAM1J3GNN3B",
	// "asin": "0000013714",
	// "reviewerName": "J. McDonald",
	// "helpful": [2, 3],
	// "reviewText": "I bought this for my husband who plays the piano.  He is having a wonderful time playing these old hymns.  The music  is at times hard to read because we think the book was published for singing from more than playing from.  Great purchase though!",
	// "overall": 5.0,
	// "summary": "Heavenly Highway Hymns",
	// "unixReviewTime": 1252800000,
	// "reviewTime": "09 13, 2009"
	public Review(JSONObject jsonObject){
		asin = (String) jsonObject.get("asin");
		reviewText = (String) jsonObject.get("reviewText");
		overall = (Double) jsonObject.get("overall");
		summary = (String) jsonObject.get("summary");
	}

	public Review(final String theAsin,
					final String theReviewText,
					final double theOverall,
					final String theSummary){
		asin = theAsin;
		reviewText = theReviewText;
		overall = theOverall;
		summary = theSummary;
	}

    public String getAsin(){
		return asin;
	}

	public String getReviewText(){
		return reviewText;
	}

	public double getOverall(){
		return overall;
	}

	public String getSummary(){
    	return summary;
    }

    @Override
    public boolean equals(final Object theOther)
    {
        boolean result = false;
        if (theOther != null && getClass() == theOther.getClass())
        {
            final Review other = (Review) theOther;
            result = asin.equals(other.asin);
        }
        return result;
    }



	@Override
	public String toString(){
		return "this came from Review.java";
	}	
}