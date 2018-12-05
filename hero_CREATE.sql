CREATE TABLE HERO (
ID NUMBER(10) NOT NULL, 
HNAME VARCHAR2(20) NOT NULL,
UNIVERSE VARCHAR2(20) NOT NULL,
POWER NUMBER(3) CHECK(POWER >=0 and power<=100) not null,
DESCRIPTION VARCHAR2(1200) NOT NULL,
ALIVE CHAR check(ALIVE in ('Y','N')),
PHONE NUMBER (11),
LOGO VARCHAR2(200)
);

 /*HERO*/ 	
INSERT
INTO HERO  
  (
    "ID",
    "HNAME",
    "UNIVERSE",
    "POWER",
    "DESCRIPTION",
    "ALIVE",
    "PHONE",
	"LOGO"
  )
  VALUES
  (
    '1',
    'Captain America',
    'Marvel',
    '80',
    'Captain America, old man',
    'Y',
    '89171123214',
	'cap_logo.jpg'
  ); 
