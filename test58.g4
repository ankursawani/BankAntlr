grammar test58;




prog:   start+;
 
start:
	banking
	|createAccount
	|NEWLINE	
	;
	
banking: 
	withExpr	
	|depoExpr	
	|balExpr
	|houseSell	
	|transferOp
	;
	
	
createAccount:
	addPerson	
	;	
	
	

transferOp:
	withExpr ' ' SUBOP SUBOP ' ' depoExpr
	;

withExpr:
	ID ' ' INT ' ' SUBOP
	;

depoExpr:
	ID ' ' INT ' ' ADDOP
	;

balExpr:
	ID
	;

addPerson: ID ' ' ATSIGN
	;

houseSell: ID ' ' INT
	;

ID:('a'..'z'|'A'..'Z')+ ;
ATSIGN: '@';
ADDOP: '+';
SUBOP: '-';
INT:'0'..'9'+ ; 
NEWLINE:'\r'? '\n' ;



	



