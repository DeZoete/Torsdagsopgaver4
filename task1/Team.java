public class Team{

			private String teamName;
			private int rank;
			private String names;


			public Team(String teamName){
				this.teamName = teamName;

			}

			public void setRank(int rank){

				this.rank = rank;

			}

			public String toString(){
				String s = "Hold: " + teamName + " rang " + rank;
				return s;

			}
			}