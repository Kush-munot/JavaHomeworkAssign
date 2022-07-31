class cricketTeam{
	int matchesWonOneDay;
	int matchesWonTest;

	cricketTeam(int matchesWonOneDay, int matchesWonTest){
		this.matchesWonOneDay = matchesWonOneDay;
		this.matchesWonTest = matchesWonTest;
	}

	public String toString(){
		return("OneDay matches won:"+matchesWonOneDay+" Test matches won: "+matchesWonTest);
	}
}