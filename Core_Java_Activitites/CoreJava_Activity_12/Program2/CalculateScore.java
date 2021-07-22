

	class CalculateScore implements Runnable {
		
		String matchType;
		 String scoreString;
		private int scores[];
		 double meanScore;
		 int minScore;
		 int maxScore;
		
		public CalculateScore(String matchType, String scoreString) {
			this.matchType = matchType;
			this.scoreString = scoreString;
			}

		public void run() {
			int min = Integer.MAX_VALUE;
			int max = 0;
			int sum=0;
			for(int i=0; i<scores.length; i++) {
				sum = sum+scores[i];
				
				if(scores[i] < min) {
					min = scores[i];
				}
				
				if(scores[i] > max) {
					max = scores[i];
				}
			}
			minScore=min;
			maxScore=max;
			meanScore=(double)((double)sum/(double)scores.length);
			
			
		}
		
		public String getMatchType() {
			return matchType;
		}

		
		public double getMeanScore() {
			return meanScore;
		}

		

		public int getMinScore() {
			return minScore;
		}

		
		public int getMaxScore() {
			return maxScore;
		}

		

		

		public void setscores() {
			String arr[]=scoreString.split(",");
	        scores = new int [arr.length];
	        for(int i=0; i<arr.length; i++) {
	            scores[i] = Integer.parseInt(arr[i]);
			
		}
		
	}
	}


