// Generated from org\apache\spark\sql\catalyst\parser\SqlBase.g4 by ANTLR 4.7
package org.apache.spark.sql.catalyst.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		SELECT=10, FROM=11, ADD=12, AS=13, ALL=14, DISTINCT=15, WHERE=16, GROUP=17, 
		BY=18, GROUPING=19, SETS=20, CUBE=21, ROLLUP=22, ORDER=23, HAVING=24, 
		LIMIT=25, AT=26, OR=27, AND=28, IN=29, NOT=30, NO=31, EXISTS=32, BETWEEN=33, 
		LIKE=34, RLIKE=35, IS=36, NULL=37, TRUE=38, FALSE=39, NULLS=40, ASC=41, 
		DESC=42, FOR=43, INTERVAL=44, CASE=45, WHEN=46, THEN=47, ELSE=48, END=49, 
		JOIN=50, CROSS=51, OUTER=52, INNER=53, LEFT=54, SEMI=55, RIGHT=56, FULL=57, 
		NATURAL=58, ON=59, LATERAL=60, WINDOW=61, OVER=62, PARTITION=63, RANGE=64, 
		ROWS=65, UNBOUNDED=66, PRECEDING=67, FOLLOWING=68, CURRENT=69, FIRST=70, 
		AFTER=71, LAST=72, ROW=73, WITH=74, VALUES=75, CREATE=76, TABLE=77, DIRECTORY=78, 
		VIEW=79, REPLACE=80, INSERT=81, DELETE=82, INTO=83, DESCRIBE=84, EXPLAIN=85, 
		FORMAT=86, LOGICAL=87, CODEGEN=88, COST=89, CAST=90, SHOW=91, TABLES=92, 
		COLUMNS=93, COLUMN=94, USE=95, PARTITIONS=96, FUNCTIONS=97, DROP=98, UNION=99, 
		EXCEPT=100, SETMINUS=101, INTERSECT=102, TO=103, TABLESAMPLE=104, STRATIFY=105, 
		ALTER=106, RENAME=107, ARRAY=108, MAP=109, STRUCT=110, COMMENT=111, SET=112, 
		RESET=113, DATA=114, START=115, TRANSACTION=116, COMMIT=117, ROLLBACK=118, 
		MACRO=119, IGNORE=120, BOTH=121, LEADING=122, TRAILING=123, IF=124, POSITION=125, 
		EQ=126, NSEQ=127, NEQ=128, NEQJ=129, LT=130, LTE=131, GT=132, GTE=133, 
		PLUS=134, MINUS=135, ASTERISK=136, SLASH=137, PERCENT=138, DIV=139, TILDE=140, 
		AMPERSAND=141, PIPE=142, CONCAT_PIPE=143, HAT=144, PERCENTLIT=145, BUCKET=146, 
		OUT=147, OF=148, SORT=149, CLUSTER=150, DISTRIBUTE=151, OVERWRITE=152, 
		TRANSFORM=153, REDUCE=154, USING=155, SERDE=156, SERDEPROPERTIES=157, 
		RECORDREADER=158, RECORDWRITER=159, DELIMITED=160, FIELDS=161, TERMINATED=162, 
		COLLECTION=163, ITEMS=164, KEYS=165, ESCAPED=166, LINES=167, SEPARATED=168, 
		FUNCTION=169, EXTENDED=170, REFRESH=171, CLEAR=172, CACHE=173, UNCACHE=174, 
		LAZY=175, FORMATTED=176, GLOBAL=177, TEMPORARY=178, OPTIONS=179, UNSET=180, 
		TBLPROPERTIES=181, DBPROPERTIES=182, BUCKETS=183, SKEWED=184, STORED=185, 
		DIRECTORIES=186, LOCATION=187, EXCHANGE=188, ARCHIVE=189, UNARCHIVE=190, 
		FILEFORMAT=191, TOUCH=192, COMPACT=193, CONCATENATE=194, CHANGE=195, CASCADE=196, 
		RESTRICT=197, CLUSTERED=198, SORTED=199, PURGE=200, INPUTFORMAT=201, OUTPUTFORMAT=202, 
		DATABASE=203, DATABASES=204, DFS=205, TRUNCATE=206, ANALYZE=207, COMPUTE=208, 
		LIST=209, STATISTICS=210, PARTITIONED=211, EXTERNAL=212, DEFINED=213, 
		REVOKE=214, GRANT=215, LOCK=216, UNLOCK=217, MSCK=218, REPAIR=219, RECOVER=220, 
		EXPORT=221, IMPORT=222, LOAD=223, ROLE=224, ROLES=225, COMPACTIONS=226, 
		PRINCIPALS=227, TRANSACTIONS=228, INDEX=229, INDEXES=230, LOCKS=231, OPTION=232, 
		ANTI=233, LOCAL=234, INPATH=235, STRING=236, BIGINT_LITERAL=237, SMALLINT_LITERAL=238, 
		TINYINT_LITERAL=239, INTEGER_VALUE=240, DECIMAL_VALUE=241, DOUBLE_LITERAL=242, 
		BIGDECIMAL_LITERAL=243, IDENTIFIER=244, BACKQUOTED_IDENTIFIER=245, SIMPLE_COMMENT=246, 
		BRACKETED_EMPTY_COMMENT=247, BRACKETED_COMMENT=248, WS=249, UNRECOGNIZED=250;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleFunctionIdentifier = 3, RULE_singleDataType = 4, RULE_singleTableSchema = 5, 
		RULE_statement = 6, RULE_unsupportedHiveNativeCommands = 7, RULE_createTableHeader = 8, 
		RULE_bucketSpec = 9, RULE_skewSpec = 10, RULE_locationSpec = 11, RULE_query = 12, 
		RULE_insertInto = 13, RULE_partitionSpecLocation = 14, RULE_partitionSpec = 15, 
		RULE_partitionVal = 16, RULE_describeFuncName = 17, RULE_describeColName = 18, 
		RULE_ctes = 19, RULE_namedQuery = 20, RULE_tableProvider = 21, RULE_tablePropertyList = 22, 
		RULE_tableProperty = 23, RULE_tablePropertyKey = 24, RULE_tablePropertyValue = 25, 
		RULE_constantList = 26, RULE_nestedConstantList = 27, RULE_createFileFormat = 28, 
		RULE_fileFormat = 29, RULE_storageHandler = 30, RULE_resource = 31, RULE_queryNoWith = 32, 
		RULE_queryOrganization = 33, RULE_multiInsertQueryBody = 34, RULE_queryTerm = 35, 
		RULE_queryPrimary = 36, RULE_sortItem = 37, RULE_querySpecification = 38, 
		RULE_hint = 39, RULE_hintStatement = 40, RULE_fromClause = 41, RULE_aggregation = 42, 
		RULE_groupingSet = 43, RULE_lateralView = 44, RULE_setQuantifier = 45, 
		RULE_relation = 46, RULE_joinRelation = 47, RULE_joinType = 48, RULE_joinCriteria = 49, 
		RULE_sample = 50, RULE_sampleMethod = 51, RULE_identifierList = 52, RULE_identifierSeq = 53, 
		RULE_orderedIdentifierList = 54, RULE_orderedIdentifier = 55, RULE_identifierCommentList = 56, 
		RULE_identifierComment = 57, RULE_relationPrimary = 58, RULE_inlineTable = 59, 
		RULE_functionTable = 60, RULE_tableAlias = 61, RULE_rowFormat = 62, RULE_tableIdentifier = 63, 
		RULE_functionIdentifier = 64, RULE_namedExpression = 65, RULE_namedExpressionSeq = 66, 
		RULE_expression = 67, RULE_booleanExpression = 68, RULE_predicated = 69, 
		RULE_predicate = 70, RULE_valueExpression = 71, RULE_primaryExpression = 72, 
		RULE_constant = 73, RULE_comparisonOperator = 74, RULE_arithmeticOperator = 75, 
		RULE_predicateOperator = 76, RULE_booleanValue = 77, RULE_interval = 78, 
		RULE_intervalField = 79, RULE_intervalValue = 80, RULE_colPosition = 81, 
		RULE_dataType = 82, RULE_colTypeList = 83, RULE_colType = 84, RULE_complexColTypeList = 85, 
		RULE_complexColType = 86, RULE_whenClause = 87, RULE_windows = 88, RULE_namedWindow = 89, 
		RULE_windowSpec = 90, RULE_windowFrame = 91, RULE_frameBound = 92, RULE_qualifiedName = 93, 
		RULE_identifier = 94, RULE_strictIdentifier = 95, RULE_quotedIdentifier = 96, 
		RULE_number = 97, RULE_nonReserved = 98;
	public static final String[] ruleNames = {
		"singleStatement", "singleExpression", "singleTableIdentifier", "singleFunctionIdentifier", 
		"singleDataType", "singleTableSchema", "statement", "unsupportedHiveNativeCommands", 
		"createTableHeader", "bucketSpec", "skewSpec", "locationSpec", "query", 
		"insertInto", "partitionSpecLocation", "partitionSpec", "partitionVal", 
		"describeFuncName", "describeColName", "ctes", "namedQuery", "tableProvider", 
		"tablePropertyList", "tableProperty", "tablePropertyKey", "tablePropertyValue", 
		"constantList", "nestedConstantList", "createFileFormat", "fileFormat", 
		"storageHandler", "resource", "queryNoWith", "queryOrganization", "multiInsertQueryBody", 
		"queryTerm", "queryPrimary", "sortItem", "querySpecification", "hint", 
		"hintStatement", "fromClause", "aggregation", "groupingSet", "lateralView", 
		"setQuantifier", "relation", "joinRelation", "joinType", "joinCriteria", 
		"sample", "sampleMethod", "identifierList", "identifierSeq", "orderedIdentifierList", 
		"orderedIdentifier", "identifierCommentList", "identifierComment", "relationPrimary", 
		"inlineTable", "functionTable", "tableAlias", "rowFormat", "tableIdentifier", 
		"functionIdentifier", "namedExpression", "namedExpressionSeq", "expression", 
		"booleanExpression", "predicated", "predicate", "valueExpression", "primaryExpression", 
		"constant", "comparisonOperator", "arithmeticOperator", "predicateOperator", 
		"booleanValue", "interval", "intervalField", "intervalValue", "colPosition", 
		"dataType", "colTypeList", "colType", "complexColTypeList", "complexColType", 
		"whenClause", "windows", "namedWindow", "windowSpec", "windowFrame", "frameBound", 
		"qualifiedName", "identifier", "strictIdentifier", "quotedIdentifier", 
		"number", "nonReserved"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'.'", "'/*+'", "'*/'", "'['", "']'", "':'", 
		"'SELECT'", "'FROM'", "'ADD'", "'AS'", "'ALL'", "'DISTINCT'", "'WHERE'", 
		"'GROUP'", "'BY'", "'GROUPING'", "'SETS'", "'CUBE'", "'ROLLUP'", "'ORDER'", 
		"'HAVING'", "'LIMIT'", "'AT'", "'OR'", "'AND'", "'IN'", null, "'NO'", 
		"'EXISTS'", "'BETWEEN'", "'LIKE'", null, "'IS'", "'NULL'", "'TRUE'", "'FALSE'", 
		"'NULLS'", "'ASC'", "'DESC'", "'FOR'", "'INTERVAL'", "'CASE'", "'WHEN'", 
		"'THEN'", "'ELSE'", "'END'", "'JOIN'", "'CROSS'", "'OUTER'", "'INNER'", 
		"'LEFT'", "'SEMI'", "'RIGHT'", "'FULL'", "'NATURAL'", "'ON'", "'LATERAL'", 
		"'WINDOW'", "'OVER'", "'PARTITION'", "'RANGE'", "'ROWS'", "'UNBOUNDED'", 
		"'PRECEDING'", "'FOLLOWING'", "'CURRENT'", "'FIRST'", "'AFTER'", "'LAST'", 
		"'ROW'", "'WITH'", "'VALUES'", "'CREATE'", "'TABLE'", "'DIRECTORY'", "'VIEW'", 
		"'REPLACE'", "'INSERT'", "'DELETE'", "'INTO'", "'DESCRIBE'", "'EXPLAIN'", 
		"'FORMAT'", "'LOGICAL'", "'CODEGEN'", "'COST'", "'CAST'", "'SHOW'", "'TABLES'", 
		"'COLUMNS'", "'COLUMN'", "'USE'", "'PARTITIONS'", "'FUNCTIONS'", "'DROP'", 
		"'UNION'", "'EXCEPT'", "'MINUS'", "'INTERSECT'", "'TO'", "'TABLESAMPLE'", 
		"'STRATIFY'", "'ALTER'", "'RENAME'", "'ARRAY'", "'MAP'", "'STRUCT'", "'COMMENT'", 
		"'SET'", "'RESET'", "'DATA'", "'START'", "'TRANSACTION'", "'COMMIT'", 
		"'ROLLBACK'", "'MACRO'", "'IGNORE'", "'BOTH'", "'LEADING'", "'TRAILING'", 
		"'IF'", "'POSITION'", null, "'<=>'", "'<>'", "'!='", "'<'", null, "'>'", 
		null, "'+'", "'-'", "'*'", "'/'", "'%'", "'DIV'", "'~'", "'&'", "'|'", 
		"'||'", "'^'", "'PERCENT'", "'BUCKET'", "'OUT'", "'OF'", "'SORT'", "'CLUSTER'", 
		"'DISTRIBUTE'", "'OVERWRITE'", "'TRANSFORM'", "'REDUCE'", "'USING'", "'SERDE'", 
		"'SERDEPROPERTIES'", "'RECORDREADER'", "'RECORDWRITER'", "'DELIMITED'", 
		"'FIELDS'", "'TERMINATED'", "'COLLECTION'", "'ITEMS'", "'KEYS'", "'ESCAPED'", 
		"'LINES'", "'SEPARATED'", "'FUNCTION'", "'EXTENDED'", "'REFRESH'", "'CLEAR'", 
		"'CACHE'", "'UNCACHE'", "'LAZY'", "'FORMATTED'", "'GLOBAL'", null, "'OPTIONS'", 
		"'UNSET'", "'TBLPROPERTIES'", "'DBPROPERTIES'", "'BUCKETS'", "'SKEWED'", 
		"'STORED'", "'DIRECTORIES'", "'LOCATION'", "'EXCHANGE'", "'ARCHIVE'", 
		"'UNARCHIVE'", "'FILEFORMAT'", "'TOUCH'", "'COMPACT'", "'CONCATENATE'", 
		"'CHANGE'", "'CASCADE'", "'RESTRICT'", "'CLUSTERED'", "'SORTED'", "'PURGE'", 
		"'INPUTFORMAT'", "'OUTPUTFORMAT'", null, null, "'DFS'", "'TRUNCATE'", 
		"'ANALYZE'", "'COMPUTE'", "'LIST'", "'STATISTICS'", "'PARTITIONED'", "'EXTERNAL'", 
		"'DEFINED'", "'REVOKE'", "'GRANT'", "'LOCK'", "'UNLOCK'", "'MSCK'", "'REPAIR'", 
		"'RECOVER'", "'EXPORT'", "'IMPORT'", "'LOAD'", "'ROLE'", "'ROLES'", "'COMPACTIONS'", 
		"'PRINCIPALS'", "'TRANSACTIONS'", "'INDEX'", "'INDEXES'", "'LOCKS'", "'OPTION'", 
		"'ANTI'", "'LOCAL'", "'INPATH'", null, null, null, null, null, null, null, 
		null, null, null, null, "'/**/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "SELECT", 
		"FROM", "ADD", "AS", "ALL", "DISTINCT", "WHERE", "GROUP", "BY", "GROUPING", 
		"SETS", "CUBE", "ROLLUP", "ORDER", "HAVING", "LIMIT", "AT", "OR", "AND", 
		"IN", "NOT", "NO", "EXISTS", "BETWEEN", "LIKE", "RLIKE", "IS", "NULL", 
		"TRUE", "FALSE", "NULLS", "ASC", "DESC", "FOR", "INTERVAL", "CASE", "WHEN", 
		"THEN", "ELSE", "END", "JOIN", "CROSS", "OUTER", "INNER", "LEFT", "SEMI", 
		"RIGHT", "FULL", "NATURAL", "ON", "LATERAL", "WINDOW", "OVER", "PARTITION", 
		"RANGE", "ROWS", "UNBOUNDED", "PRECEDING", "FOLLOWING", "CURRENT", "FIRST", 
		"AFTER", "LAST", "ROW", "WITH", "VALUES", "CREATE", "TABLE", "DIRECTORY", 
		"VIEW", "REPLACE", "INSERT", "DELETE", "INTO", "DESCRIBE", "EXPLAIN", 
		"FORMAT", "LOGICAL", "CODEGEN", "COST", "CAST", "SHOW", "TABLES", "COLUMNS", 
		"COLUMN", "USE", "PARTITIONS", "FUNCTIONS", "DROP", "UNION", "EXCEPT", 
		"SETMINUS", "INTERSECT", "TO", "TABLESAMPLE", "STRATIFY", "ALTER", "RENAME", 
		"ARRAY", "MAP", "STRUCT", "COMMENT", "SET", "RESET", "DATA", "START", 
		"TRANSACTION", "COMMIT", "ROLLBACK", "MACRO", "IGNORE", "BOTH", "LEADING", 
		"TRAILING", "IF", "POSITION", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", 
		"GT", "GTE", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "DIV", "TILDE", 
		"AMPERSAND", "PIPE", "CONCAT_PIPE", "HAT", "PERCENTLIT", "BUCKET", "OUT", 
		"OF", "SORT", "CLUSTER", "DISTRIBUTE", "OVERWRITE", "TRANSFORM", "REDUCE", 
		"USING", "SERDE", "SERDEPROPERTIES", "RECORDREADER", "RECORDWRITER", "DELIMITED", 
		"FIELDS", "TERMINATED", "COLLECTION", "ITEMS", "KEYS", "ESCAPED", "LINES", 
		"SEPARATED", "FUNCTION", "EXTENDED", "REFRESH", "CLEAR", "CACHE", "UNCACHE", 
		"LAZY", "FORMATTED", "GLOBAL", "TEMPORARY", "OPTIONS", "UNSET", "TBLPROPERTIES", 
		"DBPROPERTIES", "BUCKETS", "SKEWED", "STORED", "DIRECTORIES", "LOCATION", 
		"EXCHANGE", "ARCHIVE", "UNARCHIVE", "FILEFORMAT", "TOUCH", "COMPACT", 
		"CONCATENATE", "CHANGE", "CASCADE", "RESTRICT", "CLUSTERED", "SORTED", 
		"PURGE", "INPUTFORMAT", "OUTPUTFORMAT", "DATABASE", "DATABASES", "DFS", 
		"TRUNCATE", "ANALYZE", "COMPUTE", "LIST", "STATISTICS", "PARTITIONED", 
		"EXTERNAL", "DEFINED", "REVOKE", "GRANT", "LOCK", "UNLOCK", "MSCK", "REPAIR", 
		"RECOVER", "EXPORT", "IMPORT", "LOAD", "ROLE", "ROLES", "COMPACTIONS", 
		"PRINCIPALS", "TRANSACTIONS", "INDEX", "INDEXES", "LOCKS", "OPTION", "ANTI", 
		"LOCAL", "INPATH", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", 
		"INTEGER_VALUE", "DECIMAL_VALUE", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", 
		"IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
		"BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * Verify whether current token is a valid decimal token (which contains dot).
	   * Returns true if the character that follows the token is not a digit or letter or underscore.
	   *
	   * For example:
	   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
	   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
	   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
	   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is followed
	   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
	   * which is not a digit or letter or underscore.
	   */
	  public boolean isValidDecimal() {
	    int nextChar = _input.LA(1);
	    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
	      nextChar == '_') {
	      return false;
	    } else {
	      return true;
	    }
	  }

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			statement();
			setState(199);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			namedExpression();
			setState(202);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			tableIdentifier();
			setState(205);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			functionIdentifier();
			setState(208);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			dataType();
			setState(211);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableSchemaContext extends ParserRuleContext {
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleTableSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleTableSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleTableSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableSchemaContext singleTableSchema() throws RecognitionException {
		SingleTableSchemaContext _localctx = new SingleTableSchemaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleTableSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			colTypeList();
			setState(214);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropDatabaseContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public DropDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeDatabaseContext extends StatementContext {
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterViewQueryContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterViewQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterViewQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterViewQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public IdentifierContext db;
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTempViewUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTempViewUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTempViewUsing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public TableIdentifierContext from;
		public TableIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FailNativeCommandContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFailNativeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFailNativeCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFailNativeCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterClearCache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitClearCache(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitClearCache(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public IdentifierContext db;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RecoverPartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public RecoverPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRecoverPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRecoverPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRecoverPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepairTableContext extends StatementContext {
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public RepairTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRepairTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRepairTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRepairTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public IdentifierContext db;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public List<TerminalNode> FROM() { return getTokens(SqlBaseParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(SqlBaseParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(SqlBaseParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(SqlBaseParser.IN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterManageResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitManageResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitManageResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateDatabaseContext extends StatementContext {
		public Token comment;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public CreateDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateHiveTableContext extends StatementContext {
		public ColTypeListContext columns;
		public Token comment;
		public ColTypeListContext partitionColumns;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public BucketSpecContext bucketSpec() {
			return getRuleContext(BucketSpecContext.class,0);
		}
		public SkewSpecContext skewSpec() {
			return getRuleContext(SkewSpecContext.class,0);
		}
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<ColTypeListContext> colTypeList() {
			return getRuleContexts(ColTypeListContext.class);
		}
		public ColTypeListContext colTypeList(int i) {
			return getRuleContext(ColTypeListContext.class,i);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CreateHiveTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateHiveTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateHiveTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateHiveTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionContext extends StatementContext {
		public Token className;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTableContext extends StatementContext {
		public IdentifierContext db;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ShowTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetDatabasePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetDatabasePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetDatabaseProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetDatabaseProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetDatabaseProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public TablePropertyListContext options;
		public IdentifierListContext partitionColumnNames;
		public Token comment;
		public TablePropertyListContext tableProps;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public BucketSpecContext bucketSpec() {
			return getRuleContext(BucketSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeTableContext extends StatementContext {
		public Token option;
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public DescribeTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUncacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUncacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUncacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadDataContext extends StatementContext {
		public Token path;
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLoadData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLoadData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLoadData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChangeColumnContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public ChangeColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterChangeColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitChangeColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitChangeColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTruncateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTruncateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableSerDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableSerDe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableSerDe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTablePartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTablePartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTablePartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowDatabasesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ShowDatabasesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowDatabases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowDatabases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowDatabases(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTblPropertiesContext extends StatementContext {
		public TableIdentifierContext table;
		public TablePropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTblProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTblProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTblProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnsetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnsetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnsetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CacheTableContext extends StatementContext {
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTableColumnsContext extends StatementContext {
		public ColTypeListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public AddTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(838);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				query();
				}
				break;
			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(USE);
				setState(218);
				((UseContext)_localctx).db = identifier();
				}
				break;
			case 3:
				_localctx = new CreateDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(CREATE);
				setState(220);
				match(DATABASE);
				setState(224);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(221);
					match(IF);
					setState(222);
					match(NOT);
					setState(223);
					match(EXISTS);
					}
					break;
				}
				setState(226);
				identifier();
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(227);
					match(COMMENT);
					setState(228);
					((CreateDatabaseContext)_localctx).comment = match(STRING);
					}
				}

				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(231);
					locationSpec();
					}
				}

				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(234);
					match(WITH);
					setState(235);
					match(DBPROPERTIES);
					setState(236);
					tablePropertyList();
					}
				}

				}
				break;
			case 4:
				_localctx = new SetDatabasePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				match(ALTER);
				setState(240);
				match(DATABASE);
				setState(241);
				identifier();
				setState(242);
				match(SET);
				setState(243);
				match(DBPROPERTIES);
				setState(244);
				tablePropertyList();
				}
				break;
			case 5:
				_localctx = new DropDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				match(DROP);
				setState(247);
				match(DATABASE);
				setState(250);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(248);
					match(IF);
					setState(249);
					match(EXISTS);
					}
					break;
				}
				setState(252);
				identifier();
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(253);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 6:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(256);
				createTableHeader();
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(257);
					match(T__0);
					setState(258);
					colTypeList();
					setState(259);
					match(T__1);
					}
				}

				setState(263);
				tableProvider();
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(264);
					match(OPTIONS);
					setState(265);
					((CreateTableContext)_localctx).options = tablePropertyList();
					}
				}

				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(268);
					match(PARTITIONED);
					setState(269);
					match(BY);
					setState(270);
					((CreateTableContext)_localctx).partitionColumnNames = identifierList();
					}
				}

				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED) {
					{
					setState(273);
					bucketSpec();
					}
				}

				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(276);
					locationSpec();
					}
				}

				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(279);
					match(COMMENT);
					setState(280);
					((CreateTableContext)_localctx).comment = match(STRING);
					}
				}

				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TBLPROPERTIES) {
					{
					setState(283);
					match(TBLPROPERTIES);
					setState(284);
					((CreateTableContext)_localctx).tableProps = tablePropertyList();
					}
				}

				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (WITH - 74)) | (1L << (VALUES - 74)) | (1L << (TABLE - 74)) | (1L << (INSERT - 74)) | (1L << (MAP - 74)))) != 0) || _la==REDUCE) {
					{
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(287);
						match(AS);
						}
					}

					setState(290);
					query();
					}
				}

				}
				break;
			case 7:
				_localctx = new CreateHiveTableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(293);
				createTableHeader();
				setState(298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(294);
					match(T__0);
					setState(295);
					((CreateHiveTableContext)_localctx).columns = colTypeList();
					setState(296);
					match(T__1);
					}
					break;
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(300);
					match(COMMENT);
					setState(301);
					((CreateHiveTableContext)_localctx).comment = match(STRING);
					}
				}

				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(304);
					match(PARTITIONED);
					setState(305);
					match(BY);
					setState(306);
					match(T__0);
					setState(307);
					((CreateHiveTableContext)_localctx).partitionColumns = colTypeList();
					setState(308);
					match(T__1);
					}
				}

				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED) {
					{
					setState(312);
					bucketSpec();
					}
				}

				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SKEWED) {
					{
					setState(315);
					skewSpec();
					}
				}

				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(318);
					rowFormat();
					}
				}

				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(321);
					createFileFormat();
					}
				}

				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(324);
					locationSpec();
					}
				}

				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TBLPROPERTIES) {
					{
					setState(327);
					match(TBLPROPERTIES);
					setState(328);
					tablePropertyList();
					}
				}

				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (WITH - 74)) | (1L << (VALUES - 74)) | (1L << (TABLE - 74)) | (1L << (INSERT - 74)) | (1L << (MAP - 74)))) != 0) || _la==REDUCE) {
					{
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(331);
						match(AS);
						}
					}

					setState(334);
					query();
					}
				}

				}
				break;
			case 8:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(337);
				match(CREATE);
				setState(338);
				match(TABLE);
				setState(342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(339);
					match(IF);
					setState(340);
					match(NOT);
					setState(341);
					match(EXISTS);
					}
					break;
				}
				setState(344);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(345);
				match(LIKE);
				setState(346);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(347);
					locationSpec();
					}
				}

				}
				break;
			case 9:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(350);
				match(ANALYZE);
				setState(351);
				match(TABLE);
				setState(352);
				tableIdentifier();
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(353);
					partitionSpec();
					}
				}

				setState(356);
				match(COMPUTE);
				setState(357);
				match(STATISTICS);
				setState(362);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(358);
					identifier();
					}
					break;
				case 2:
					{
					setState(359);
					match(FOR);
					setState(360);
					match(COLUMNS);
					setState(361);
					identifierSeq();
					}
					break;
				}
				}
				break;
			case 10:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(364);
				match(ALTER);
				setState(365);
				match(TABLE);
				setState(366);
				tableIdentifier();
				setState(367);
				match(ADD);
				setState(368);
				match(COLUMNS);
				setState(369);
				match(T__0);
				setState(370);
				((AddTableColumnsContext)_localctx).columns = colTypeList();
				setState(371);
				match(T__1);
				}
				break;
			case 11:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(373);
				match(ALTER);
				setState(374);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(375);
				((RenameTableContext)_localctx).from = tableIdentifier();
				setState(376);
				match(RENAME);
				setState(377);
				match(TO);
				setState(378);
				((RenameTableContext)_localctx).to = tableIdentifier();
				}
				break;
			case 12:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(380);
				match(ALTER);
				setState(381);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(382);
				tableIdentifier();
				setState(383);
				match(SET);
				setState(384);
				match(TBLPROPERTIES);
				setState(385);
				tablePropertyList();
				}
				break;
			case 13:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(387);
				match(ALTER);
				setState(388);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(389);
				tableIdentifier();
				setState(390);
				match(UNSET);
				setState(391);
				match(TBLPROPERTIES);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(392);
					match(IF);
					setState(393);
					match(EXISTS);
					}
				}

				setState(396);
				tablePropertyList();
				}
				break;
			case 14:
				_localctx = new ChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(398);
				match(ALTER);
				setState(399);
				match(TABLE);
				setState(400);
				tableIdentifier();
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(401);
					partitionSpec();
					}
				}

				setState(404);
				match(CHANGE);
				setState(406);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(405);
					match(COLUMN);
					}
					break;
				}
				setState(408);
				identifier();
				setState(409);
				colType();
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FIRST || _la==AFTER) {
					{
					setState(410);
					colPosition();
					}
				}

				}
				break;
			case 15:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(413);
				match(ALTER);
				setState(414);
				match(TABLE);
				setState(415);
				tableIdentifier();
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(416);
					partitionSpec();
					}
				}

				setState(419);
				match(SET);
				setState(420);
				match(SERDE);
				setState(421);
				match(STRING);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(422);
					match(WITH);
					setState(423);
					match(SERDEPROPERTIES);
					setState(424);
					tablePropertyList();
					}
				}

				}
				break;
			case 16:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(427);
				match(ALTER);
				setState(428);
				match(TABLE);
				setState(429);
				tableIdentifier();
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(430);
					partitionSpec();
					}
				}

				setState(433);
				match(SET);
				setState(434);
				match(SERDEPROPERTIES);
				setState(435);
				tablePropertyList();
				}
				break;
			case 17:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(437);
				match(ALTER);
				setState(438);
				match(TABLE);
				setState(439);
				tableIdentifier();
				setState(440);
				match(ADD);
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(441);
					match(IF);
					setState(442);
					match(NOT);
					setState(443);
					match(EXISTS);
					}
				}

				setState(447); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(446);
					partitionSpecLocation();
					}
					}
					setState(449); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 18:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(451);
				match(ALTER);
				setState(452);
				match(VIEW);
				setState(453);
				tableIdentifier();
				setState(454);
				match(ADD);
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(455);
					match(IF);
					setState(456);
					match(NOT);
					setState(457);
					match(EXISTS);
					}
				}

				setState(461); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(460);
					partitionSpec();
					}
					}
					setState(463); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 19:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(465);
				match(ALTER);
				setState(466);
				match(TABLE);
				setState(467);
				tableIdentifier();
				setState(468);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(469);
				match(RENAME);
				setState(470);
				match(TO);
				setState(471);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 20:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(473);
				match(ALTER);
				setState(474);
				match(TABLE);
				setState(475);
				tableIdentifier();
				setState(476);
				match(DROP);
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(477);
					match(IF);
					setState(478);
					match(EXISTS);
					}
				}

				setState(481);
				partitionSpec();
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(482);
					match(T__2);
					setState(483);
					partitionSpec();
					}
					}
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(489);
					match(PURGE);
					}
				}

				}
				break;
			case 21:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(492);
				match(ALTER);
				setState(493);
				match(VIEW);
				setState(494);
				tableIdentifier();
				setState(495);
				match(DROP);
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(496);
					match(IF);
					setState(497);
					match(EXISTS);
					}
				}

				setState(500);
				partitionSpec();
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(501);
					match(T__2);
					setState(502);
					partitionSpec();
					}
					}
					setState(507);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 22:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(508);
				match(ALTER);
				setState(509);
				match(TABLE);
				setState(510);
				tableIdentifier();
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(511);
					partitionSpec();
					}
				}

				setState(514);
				match(SET);
				setState(515);
				locationSpec();
				}
				break;
			case 23:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(517);
				match(ALTER);
				setState(518);
				match(TABLE);
				setState(519);
				tableIdentifier();
				setState(520);
				match(RECOVER);
				setState(521);
				match(PARTITIONS);
				}
				break;
			case 24:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(523);
				match(DROP);
				setState(524);
				match(TABLE);
				setState(527);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(525);
					match(IF);
					setState(526);
					match(EXISTS);
					}
					break;
				}
				setState(529);
				tableIdentifier();
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(530);
					match(PURGE);
					}
				}

				}
				break;
			case 25:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(533);
				match(DROP);
				setState(534);
				match(VIEW);
				setState(537);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(535);
					match(IF);
					setState(536);
					match(EXISTS);
					}
					break;
				}
				setState(539);
				tableIdentifier();
				}
				break;
			case 26:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(540);
				match(CREATE);
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(541);
					match(OR);
					setState(542);
					match(REPLACE);
					}
				}

				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(546);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(545);
						match(GLOBAL);
						}
					}

					setState(548);
					match(TEMPORARY);
					}
				}

				setState(551);
				match(VIEW);
				setState(555);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(552);
					match(IF);
					setState(553);
					match(NOT);
					setState(554);
					match(EXISTS);
					}
					break;
				}
				setState(557);
				tableIdentifier();
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(558);
					identifierCommentList();
					}
				}

				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(561);
					match(COMMENT);
					setState(562);
					match(STRING);
					}
				}

				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(565);
					match(PARTITIONED);
					setState(566);
					match(ON);
					setState(567);
					identifierList();
					}
				}

				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TBLPROPERTIES) {
					{
					setState(570);
					match(TBLPROPERTIES);
					setState(571);
					tablePropertyList();
					}
				}

				setState(574);
				match(AS);
				setState(575);
				query();
				}
				break;
			case 27:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(577);
				match(CREATE);
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(578);
					match(OR);
					setState(579);
					match(REPLACE);
					}
				}

				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(582);
					match(GLOBAL);
					}
				}

				setState(585);
				match(TEMPORARY);
				setState(586);
				match(VIEW);
				setState(587);
				tableIdentifier();
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(588);
					match(T__0);
					setState(589);
					colTypeList();
					setState(590);
					match(T__1);
					}
				}

				setState(594);
				tableProvider();
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(595);
					match(OPTIONS);
					setState(596);
					tablePropertyList();
					}
				}

				}
				break;
			case 28:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(599);
				match(ALTER);
				setState(600);
				match(VIEW);
				setState(601);
				tableIdentifier();
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(602);
					match(AS);
					}
				}

				setState(605);
				query();
				}
				break;
			case 29:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(607);
				match(CREATE);
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(608);
					match(OR);
					setState(609);
					match(REPLACE);
					}
				}

				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(612);
					match(TEMPORARY);
					}
				}

				setState(615);
				match(FUNCTION);
				setState(619);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(616);
					match(IF);
					setState(617);
					match(NOT);
					setState(618);
					match(EXISTS);
					}
					break;
				}
				setState(621);
				qualifiedName();
				setState(622);
				match(AS);
				setState(623);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(624);
					match(USING);
					setState(625);
					resource();
					setState(630);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(626);
						match(T__2);
						setState(627);
						resource();
						}
						}
						setState(632);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 30:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(635);
				match(DROP);
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(636);
					match(TEMPORARY);
					}
				}

				setState(639);
				match(FUNCTION);
				setState(642);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(640);
					match(IF);
					setState(641);
					match(EXISTS);
					}
					break;
				}
				setState(644);
				qualifiedName();
				}
				break;
			case 31:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(645);
				match(EXPLAIN);
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (LOGICAL - 87)) | (1L << (CODEGEN - 87)) | (1L << (COST - 87)))) != 0) || _la==EXTENDED || _la==FORMATTED) {
					{
					setState(646);
					_la = _input.LA(1);
					if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (LOGICAL - 87)) | (1L << (CODEGEN - 87)) | (1L << (COST - 87)))) != 0) || _la==EXTENDED || _la==FORMATTED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(649);
				statement();
				}
				break;
			case 32:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(650);
				match(SHOW);
				setState(651);
				match(TABLES);
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(652);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(653);
					((ShowTablesContext)_localctx).db = identifier();
					}
				}

				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(657);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(656);
						match(LIKE);
						}
					}

					setState(659);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 33:
				_localctx = new ShowTableContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(662);
				match(SHOW);
				setState(663);
				match(TABLE);
				setState(664);
				match(EXTENDED);
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(665);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(666);
					((ShowTableContext)_localctx).db = identifier();
					}
				}

				setState(669);
				match(LIKE);
				setState(670);
				((ShowTableContext)_localctx).pattern = match(STRING);
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(671);
					partitionSpec();
					}
				}

				}
				break;
			case 34:
				_localctx = new ShowDatabasesContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(674);
				match(SHOW);
				setState(675);
				match(DATABASES);
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(676);
					match(LIKE);
					setState(677);
					((ShowDatabasesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 35:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(680);
				match(SHOW);
				setState(681);
				match(TBLPROPERTIES);
				setState(682);
				((ShowTblPropertiesContext)_localctx).table = tableIdentifier();
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(683);
					match(T__0);
					setState(684);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(685);
					match(T__1);
					}
				}

				}
				break;
			case 36:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(689);
				match(SHOW);
				setState(690);
				match(COLUMNS);
				setState(691);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(692);
				tableIdentifier();
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(693);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(694);
					((ShowColumnsContext)_localctx).db = identifier();
					}
				}

				}
				break;
			case 37:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(697);
				match(SHOW);
				setState(698);
				match(PARTITIONS);
				setState(699);
				tableIdentifier();
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(700);
					partitionSpec();
					}
				}

				}
				break;
			case 38:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(703);
				match(SHOW);
				setState(705);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(704);
					identifier();
					}
					break;
				}
				setState(707);
				match(FUNCTIONS);
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DIV - 139)) | (1L << (PERCENTLIT - 139)) | (1L << (BUCKET - 139)) | (1L << (OUT - 139)) | (1L << (OF - 139)) | (1L << (SORT - 139)) | (1L << (CLUSTER - 139)) | (1L << (DISTRIBUTE - 139)) | (1L << (OVERWRITE - 139)) | (1L << (TRANSFORM - 139)) | (1L << (REDUCE - 139)) | (1L << (SERDE - 139)) | (1L << (SERDEPROPERTIES - 139)) | (1L << (RECORDREADER - 139)) | (1L << (RECORDWRITER - 139)) | (1L << (DELIMITED - 139)) | (1L << (FIELDS - 139)) | (1L << (TERMINATED - 139)) | (1L << (COLLECTION - 139)) | (1L << (ITEMS - 139)) | (1L << (KEYS - 139)) | (1L << (ESCAPED - 139)) | (1L << (LINES - 139)) | (1L << (SEPARATED - 139)) | (1L << (FUNCTION - 139)) | (1L << (EXTENDED - 139)) | (1L << (REFRESH - 139)) | (1L << (CLEAR - 139)) | (1L << (CACHE - 139)) | (1L << (UNCACHE - 139)) | (1L << (LAZY - 139)) | (1L << (FORMATTED - 139)) | (1L << (GLOBAL - 139)) | (1L << (TEMPORARY - 139)) | (1L << (OPTIONS - 139)) | (1L << (UNSET - 139)) | (1L << (TBLPROPERTIES - 139)) | (1L << (DBPROPERTIES - 139)) | (1L << (BUCKETS - 139)) | (1L << (SKEWED - 139)) | (1L << (STORED - 139)) | (1L << (DIRECTORIES - 139)) | (1L << (LOCATION - 139)) | (1L << (EXCHANGE - 139)) | (1L << (ARCHIVE - 139)) | (1L << (UNARCHIVE - 139)) | (1L << (FILEFORMAT - 139)) | (1L << (TOUCH - 139)) | (1L << (COMPACT - 139)) | (1L << (CONCATENATE - 139)) | (1L << (CHANGE - 139)) | (1L << (CASCADE - 139)) | (1L << (RESTRICT - 139)) | (1L << (CLUSTERED - 139)) | (1L << (SORTED - 139)) | (1L << (PURGE - 139)) | (1L << (INPUTFORMAT - 139)) | (1L << (OUTPUTFORMAT - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (DATABASE - 203)) | (1L << (DATABASES - 203)) | (1L << (DFS - 203)) | (1L << (TRUNCATE - 203)) | (1L << (ANALYZE - 203)) | (1L << (COMPUTE - 203)) | (1L << (LIST - 203)) | (1L << (STATISTICS - 203)) | (1L << (PARTITIONED - 203)) | (1L << (EXTERNAL - 203)) | (1L << (DEFINED - 203)) | (1L << (REVOKE - 203)) | (1L << (GRANT - 203)) | (1L << (LOCK - 203)) | (1L << (UNLOCK - 203)) | (1L << (MSCK - 203)) | (1L << (REPAIR - 203)) | (1L << (RECOVER - 203)) | (1L << (EXPORT - 203)) | (1L << (IMPORT - 203)) | (1L << (LOAD - 203)) | (1L << (ROLE - 203)) | (1L << (ROLES - 203)) | (1L << (COMPACTIONS - 203)) | (1L << (PRINCIPALS - 203)) | (1L << (TRANSACTIONS - 203)) | (1L << (INDEX - 203)) | (1L << (INDEXES - 203)) | (1L << (LOCKS - 203)) | (1L << (OPTION - 203)) | (1L << (ANTI - 203)) | (1L << (LOCAL - 203)) | (1L << (INPATH - 203)) | (1L << (STRING - 203)) | (1L << (IDENTIFIER - 203)) | (1L << (BACKQUOTED_IDENTIFIER - 203)))) != 0)) {
					{
					setState(709);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						setState(708);
						match(LIKE);
						}
						break;
					}
					setState(713);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SELECT:
					case FROM:
					case ADD:
					case AS:
					case ALL:
					case DISTINCT:
					case WHERE:
					case GROUP:
					case BY:
					case GROUPING:
					case SETS:
					case CUBE:
					case ROLLUP:
					case ORDER:
					case HAVING:
					case LIMIT:
					case AT:
					case OR:
					case AND:
					case IN:
					case NOT:
					case NO:
					case EXISTS:
					case BETWEEN:
					case LIKE:
					case RLIKE:
					case IS:
					case NULL:
					case TRUE:
					case FALSE:
					case NULLS:
					case ASC:
					case DESC:
					case FOR:
					case INTERVAL:
					case CASE:
					case WHEN:
					case THEN:
					case ELSE:
					case END:
					case JOIN:
					case CROSS:
					case OUTER:
					case INNER:
					case LEFT:
					case SEMI:
					case RIGHT:
					case FULL:
					case NATURAL:
					case ON:
					case LATERAL:
					case WINDOW:
					case OVER:
					case PARTITION:
					case RANGE:
					case ROWS:
					case UNBOUNDED:
					case PRECEDING:
					case FOLLOWING:
					case CURRENT:
					case FIRST:
					case AFTER:
					case LAST:
					case ROW:
					case WITH:
					case VALUES:
					case CREATE:
					case TABLE:
					case DIRECTORY:
					case VIEW:
					case REPLACE:
					case INSERT:
					case DELETE:
					case INTO:
					case DESCRIBE:
					case EXPLAIN:
					case FORMAT:
					case LOGICAL:
					case CODEGEN:
					case COST:
					case CAST:
					case SHOW:
					case TABLES:
					case COLUMNS:
					case COLUMN:
					case USE:
					case PARTITIONS:
					case FUNCTIONS:
					case DROP:
					case UNION:
					case EXCEPT:
					case SETMINUS:
					case INTERSECT:
					case TO:
					case TABLESAMPLE:
					case STRATIFY:
					case ALTER:
					case RENAME:
					case ARRAY:
					case MAP:
					case STRUCT:
					case COMMENT:
					case SET:
					case RESET:
					case DATA:
					case START:
					case TRANSACTION:
					case COMMIT:
					case ROLLBACK:
					case MACRO:
					case IGNORE:
					case BOTH:
					case LEADING:
					case TRAILING:
					case IF:
					case POSITION:
					case DIV:
					case PERCENTLIT:
					case BUCKET:
					case OUT:
					case OF:
					case SORT:
					case CLUSTER:
					case DISTRIBUTE:
					case OVERWRITE:
					case TRANSFORM:
					case REDUCE:
					case SERDE:
					case SERDEPROPERTIES:
					case RECORDREADER:
					case RECORDWRITER:
					case DELIMITED:
					case FIELDS:
					case TERMINATED:
					case COLLECTION:
					case ITEMS:
					case KEYS:
					case ESCAPED:
					case LINES:
					case SEPARATED:
					case FUNCTION:
					case EXTENDED:
					case REFRESH:
					case CLEAR:
					case CACHE:
					case UNCACHE:
					case LAZY:
					case FORMATTED:
					case GLOBAL:
					case TEMPORARY:
					case OPTIONS:
					case UNSET:
					case TBLPROPERTIES:
					case DBPROPERTIES:
					case BUCKETS:
					case SKEWED:
					case STORED:
					case DIRECTORIES:
					case LOCATION:
					case EXCHANGE:
					case ARCHIVE:
					case UNARCHIVE:
					case FILEFORMAT:
					case TOUCH:
					case COMPACT:
					case CONCATENATE:
					case CHANGE:
					case CASCADE:
					case RESTRICT:
					case CLUSTERED:
					case SORTED:
					case PURGE:
					case INPUTFORMAT:
					case OUTPUTFORMAT:
					case DATABASE:
					case DATABASES:
					case DFS:
					case TRUNCATE:
					case ANALYZE:
					case COMPUTE:
					case LIST:
					case STATISTICS:
					case PARTITIONED:
					case EXTERNAL:
					case DEFINED:
					case REVOKE:
					case GRANT:
					case LOCK:
					case UNLOCK:
					case MSCK:
					case REPAIR:
					case RECOVER:
					case EXPORT:
					case IMPORT:
					case LOAD:
					case ROLE:
					case ROLES:
					case COMPACTIONS:
					case PRINCIPALS:
					case TRANSACTIONS:
					case INDEX:
					case INDEXES:
					case LOCKS:
					case OPTION:
					case ANTI:
					case LOCAL:
					case INPATH:
					case IDENTIFIER:
					case BACKQUOTED_IDENTIFIER:
						{
						setState(711);
						qualifiedName();
						}
						break;
					case STRING:
						{
						setState(712);
						((ShowFunctionsContext)_localctx).pattern = match(STRING);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case 39:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(717);
				match(SHOW);
				setState(718);
				match(CREATE);
				setState(719);
				match(TABLE);
				setState(720);
				tableIdentifier();
				}
				break;
			case 40:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(721);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(722);
				match(FUNCTION);
				setState(724);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(723);
					match(EXTENDED);
					}
					break;
				}
				setState(726);
				describeFuncName();
				}
				break;
			case 41:
				_localctx = new DescribeDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(727);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(728);
				match(DATABASE);
				setState(730);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(729);
					match(EXTENDED);
					}
					break;
				}
				setState(732);
				identifier();
				}
				break;
			case 42:
				_localctx = new DescribeTableContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(733);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(735);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(734);
					match(TABLE);
					}
					break;
				}
				setState(738);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(737);
					((DescribeTableContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeTableContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(740);
				tableIdentifier();
				setState(742);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(741);
					partitionSpec();
					}
					break;
				}
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DIV - 139)) | (1L << (PERCENTLIT - 139)) | (1L << (BUCKET - 139)) | (1L << (OUT - 139)) | (1L << (OF - 139)) | (1L << (SORT - 139)) | (1L << (CLUSTER - 139)) | (1L << (DISTRIBUTE - 139)) | (1L << (OVERWRITE - 139)) | (1L << (TRANSFORM - 139)) | (1L << (REDUCE - 139)) | (1L << (SERDE - 139)) | (1L << (SERDEPROPERTIES - 139)) | (1L << (RECORDREADER - 139)) | (1L << (RECORDWRITER - 139)) | (1L << (DELIMITED - 139)) | (1L << (FIELDS - 139)) | (1L << (TERMINATED - 139)) | (1L << (COLLECTION - 139)) | (1L << (ITEMS - 139)) | (1L << (KEYS - 139)) | (1L << (ESCAPED - 139)) | (1L << (LINES - 139)) | (1L << (SEPARATED - 139)) | (1L << (FUNCTION - 139)) | (1L << (EXTENDED - 139)) | (1L << (REFRESH - 139)) | (1L << (CLEAR - 139)) | (1L << (CACHE - 139)) | (1L << (UNCACHE - 139)) | (1L << (LAZY - 139)) | (1L << (FORMATTED - 139)) | (1L << (GLOBAL - 139)) | (1L << (TEMPORARY - 139)) | (1L << (OPTIONS - 139)) | (1L << (UNSET - 139)) | (1L << (TBLPROPERTIES - 139)) | (1L << (DBPROPERTIES - 139)) | (1L << (BUCKETS - 139)) | (1L << (SKEWED - 139)) | (1L << (STORED - 139)) | (1L << (DIRECTORIES - 139)) | (1L << (LOCATION - 139)) | (1L << (EXCHANGE - 139)) | (1L << (ARCHIVE - 139)) | (1L << (UNARCHIVE - 139)) | (1L << (FILEFORMAT - 139)) | (1L << (TOUCH - 139)) | (1L << (COMPACT - 139)) | (1L << (CONCATENATE - 139)) | (1L << (CHANGE - 139)) | (1L << (CASCADE - 139)) | (1L << (RESTRICT - 139)) | (1L << (CLUSTERED - 139)) | (1L << (SORTED - 139)) | (1L << (PURGE - 139)) | (1L << (INPUTFORMAT - 139)) | (1L << (OUTPUTFORMAT - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (DATABASE - 203)) | (1L << (DATABASES - 203)) | (1L << (DFS - 203)) | (1L << (TRUNCATE - 203)) | (1L << (ANALYZE - 203)) | (1L << (COMPUTE - 203)) | (1L << (LIST - 203)) | (1L << (STATISTICS - 203)) | (1L << (PARTITIONED - 203)) | (1L << (EXTERNAL - 203)) | (1L << (DEFINED - 203)) | (1L << (REVOKE - 203)) | (1L << (GRANT - 203)) | (1L << (LOCK - 203)) | (1L << (UNLOCK - 203)) | (1L << (MSCK - 203)) | (1L << (REPAIR - 203)) | (1L << (RECOVER - 203)) | (1L << (EXPORT - 203)) | (1L << (IMPORT - 203)) | (1L << (LOAD - 203)) | (1L << (ROLE - 203)) | (1L << (ROLES - 203)) | (1L << (COMPACTIONS - 203)) | (1L << (PRINCIPALS - 203)) | (1L << (TRANSACTIONS - 203)) | (1L << (INDEX - 203)) | (1L << (INDEXES - 203)) | (1L << (LOCKS - 203)) | (1L << (OPTION - 203)) | (1L << (ANTI - 203)) | (1L << (LOCAL - 203)) | (1L << (INPATH - 203)) | (1L << (IDENTIFIER - 203)) | (1L << (BACKQUOTED_IDENTIFIER - 203)))) != 0)) {
					{
					setState(744);
					describeColName();
					}
				}

				}
				break;
			case 43:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(747);
				match(REFRESH);
				setState(748);
				match(TABLE);
				setState(749);
				tableIdentifier();
				}
				break;
			case 44:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(750);
				match(REFRESH);
				setState(758);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(751);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(755);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(752);
							matchWildcard();
							}
							} 
						}
						setState(757);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 45:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(760);
				match(CACHE);
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(761);
					match(LAZY);
					}
				}

				setState(764);
				match(TABLE);
				setState(765);
				tableIdentifier();
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (WITH - 74)) | (1L << (VALUES - 74)) | (1L << (TABLE - 74)) | (1L << (INSERT - 74)) | (1L << (MAP - 74)))) != 0) || _la==REDUCE) {
					{
					setState(767);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(766);
						match(AS);
						}
					}

					setState(769);
					query();
					}
				}

				}
				break;
			case 46:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(772);
				match(UNCACHE);
				setState(773);
				match(TABLE);
				setState(776);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(774);
					match(IF);
					setState(775);
					match(EXISTS);
					}
					break;
				}
				setState(778);
				tableIdentifier();
				}
				break;
			case 47:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(779);
				match(CLEAR);
				setState(780);
				match(CACHE);
				}
				break;
			case 48:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(781);
				match(LOAD);
				setState(782);
				match(DATA);
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(783);
					match(LOCAL);
					}
				}

				setState(786);
				match(INPATH);
				setState(787);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(788);
					match(OVERWRITE);
					}
				}

				setState(791);
				match(INTO);
				setState(792);
				match(TABLE);
				setState(793);
				tableIdentifier();
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(794);
					partitionSpec();
					}
				}

				}
				break;
			case 49:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(797);
				match(TRUNCATE);
				setState(798);
				match(TABLE);
				setState(799);
				tableIdentifier();
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(800);
					partitionSpec();
					}
				}

				}
				break;
			case 50:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(803);
				match(MSCK);
				setState(804);
				match(REPAIR);
				setState(805);
				match(TABLE);
				setState(806);
				tableIdentifier();
				}
				break;
			case 51:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(807);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(808);
				identifier();
				setState(812);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(809);
						matchWildcard();
						}
						} 
					}
					setState(814);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				}
				}
				break;
			case 52:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(815);
				match(SET);
				setState(816);
				match(ROLE);
				setState(820);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(817);
						matchWildcard();
						}
						} 
					}
					setState(822);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				}
				}
				break;
			case 53:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(823);
				match(SET);
				setState(827);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(824);
						matchWildcard();
						}
						} 
					}
					setState(829);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				}
				break;
			case 54:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(830);
				match(RESET);
				}
				break;
			case 55:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(831);
				unsupportedHiveNativeCommands();
				setState(835);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(832);
						matchWildcard();
						}
						} 
					}
					setState(837);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnsupportedHiveNativeCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnsupportedHiveNativeCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnsupportedHiveNativeCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1010);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(840);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(841);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(842);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(843);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(844);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(846);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(845);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(848);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(850);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(849);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(852);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(853);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(854);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(855);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(857);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(856);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(859);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(860);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(861);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(862);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(863);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(864);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(865);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(866);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(867);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(868);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(869);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(870);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(871);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(872);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(873);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(874);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(875);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(876);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(877);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(878);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(879);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(880);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(881);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(882);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(883);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(884);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(885);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(886);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(887);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(888);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(889);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(890);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(891);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(892);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(893);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(894);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(895);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(896);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(897);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(898);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(899);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(900);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(901);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(902);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(903);
				tableIdentifier();
				setState(904);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(905);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(907);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(908);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(909);
				tableIdentifier();
				setState(910);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(911);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(913);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(914);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(915);
				tableIdentifier();
				setState(916);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(917);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(919);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(920);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(921);
				tableIdentifier();
				setState(922);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(923);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(925);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(926);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(927);
				tableIdentifier();
				setState(928);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(929);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(931);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(932);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(933);
				tableIdentifier();
				setState(934);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(935);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(936);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(937);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(939);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(940);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(941);
				tableIdentifier();
				setState(942);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(943);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(944);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(946);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(947);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(948);
				tableIdentifier();
				setState(949);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(950);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(952);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(953);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(954);
				tableIdentifier();
				setState(955);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(956);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(958);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(959);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(960);
				tableIdentifier();
				setState(961);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(962);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(964);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(965);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(966);
				tableIdentifier();
				setState(967);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(969);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(970);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(971);
				tableIdentifier();
				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(972);
					partitionSpec();
					}
				}

				setState(975);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(977);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(978);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(979);
				tableIdentifier();
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(980);
					partitionSpec();
					}
				}

				setState(983);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(985);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(986);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(987);
				tableIdentifier();
				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(988);
					partitionSpec();
					}
				}

				setState(991);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(992);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(994);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(995);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(996);
				tableIdentifier();
				setState(998);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(997);
					partitionSpec();
					}
				}

				setState(1000);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(1001);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1003);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1004);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1005);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1006);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1007);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(1008);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DELETE);
				setState(1009);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(FROM);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			match(CREATE);
			setState(1014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1013);
				match(TEMPORARY);
				}
			}

			setState(1017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1016);
				match(EXTERNAL);
				}
			}

			setState(1019);
			match(TABLE);
			setState(1023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1020);
				match(IF);
				setState(1021);
				match(NOT);
				setState(1022);
				match(EXISTS);
				}
				break;
			}
			setState(1025);
			tableIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBucketSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBucketSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			match(CLUSTERED);
			setState(1028);
			match(BY);
			setState(1029);
			identifierList();
			setState(1033);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1030);
				match(SORTED);
				setState(1031);
				match(BY);
				setState(1032);
				orderedIdentifierList();
				}
			}

			setState(1035);
			match(INTO);
			setState(1036);
			match(INTEGER_VALUE);
			setState(1037);
			match(BUCKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSkewSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSkewSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			match(SKEWED);
			setState(1040);
			match(BY);
			setState(1041);
			identifierList();
			setState(1042);
			match(ON);
			setState(1045);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1043);
				constantList();
				}
				break;
			case 2:
				{
				setState(1044);
				nestedConstantList();
				}
				break;
			}
			setState(1050);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1047);
				match(STORED);
				setState(1048);
				match(AS);
				setState(1049);
				match(DIRECTORIES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			match(LOCATION);
			setState(1053);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1055);
				ctes();
				}
			}

			setState(1058);
			queryNoWith();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertIntoContext extends ParserRuleContext {
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public Token path;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public InsertOverwriteHiveDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteHiveDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteHiveDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteHiveDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteDirContext extends InsertIntoContext {
		public Token path;
		public TablePropertyListContext options;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public InsertOverwriteDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public InsertOverwriteTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public InsertIntoTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_insertInto);
		int _la;
		try {
			setState(1108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1060);
				match(INSERT);
				setState(1061);
				match(OVERWRITE);
				setState(1062);
				match(TABLE);
				setState(1063);
				tableIdentifier();
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1064);
					partitionSpec();
					setState(1068);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1065);
						match(IF);
						setState(1066);
						match(NOT);
						setState(1067);
						match(EXISTS);
						}
					}

					}
				}

				}
				break;
			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1072);
				match(INSERT);
				setState(1073);
				match(INTO);
				setState(1075);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1074);
					match(TABLE);
					}
					break;
				}
				setState(1077);
				tableIdentifier();
				setState(1079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1078);
					partitionSpec();
					}
				}

				}
				break;
			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1081);
				match(INSERT);
				setState(1082);
				match(OVERWRITE);
				setState(1084);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1083);
					match(LOCAL);
					}
				}

				setState(1086);
				match(DIRECTORY);
				setState(1087);
				((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(1089);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1088);
					rowFormat();
					}
				}

				setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1091);
					createFileFormat();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1094);
				match(INSERT);
				setState(1095);
				match(OVERWRITE);
				setState(1097);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1096);
					match(LOCAL);
					}
				}

				setState(1099);
				match(DIRECTORY);
				setState(1101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1100);
					((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(1103);
				tableProvider();
				setState(1106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1104);
					match(OPTIONS);
					setState(1105);
					((InsertOverwriteDirContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionSpecLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionSpecLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			partitionSpec();
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1111);
				locationSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			match(PARTITION);
			setState(1115);
			match(T__0);
			setState(1116);
			partitionVal();
			setState(1121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1117);
				match(T__2);
				setState(1118);
				partitionVal();
				}
				}
				setState(1123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1124);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1126);
			identifier();
			setState(1129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1127);
				match(EQ);
				setState(1128);
				constant();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_describeFuncName);
		try {
			setState(1136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1131);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1132);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1133);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1134);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1135);
				predicateOperator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeColNameContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeColName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeColName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1139);
				match(T__3);
				setState(1140);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			match(WITH);
			setState(1147);
			namedQuery();
			setState(1152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1148);
				match(T__2);
				setState(1149);
				namedQuery();
				}
				}
				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			((NamedQueryContext)_localctx).name = identifier();
			setState(1157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1156);
				match(AS);
				}
			}

			setState(1159);
			match(T__0);
			setState(1160);
			query();
			setState(1161);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProvider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProvider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1163);
			match(USING);
			setState(1164);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			match(T__0);
			setState(1167);
			tableProperty();
			setState(1172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1168);
				match(T__2);
				setState(1169);
				tableProperty();
				}
				}
				setState(1174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1175);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRUE || _la==FALSE || _la==EQ || ((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & ((1L << (STRING - 236)) | (1L << (INTEGER_VALUE - 236)) | (1L << (DECIMAL_VALUE - 236)))) != 0)) {
				{
				setState(1179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1178);
					match(EQ);
					}
				}

				setState(1181);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1184);
				identifier();
				setState(1189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1185);
					match(T__3);
					setState(1186);
					identifier();
					}
					}
					setState(1191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1192);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tablePropertyValue);
		try {
			setState(1199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1195);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1196);
				match(DECIMAL_VALUE);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1197);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1198);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201);
			match(T__0);
			setState(1202);
			constant();
			setState(1207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1203);
				match(T__2);
				setState(1204);
				constant();
				}
				}
				setState(1209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1210);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedConstantListContext extends ParserRuleContext {
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNestedConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNestedConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1212);
			match(T__0);
			setState(1213);
			constantList();
			setState(1218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1214);
				match(T__2);
				setState(1215);
				constantList();
				}
				}
				setState(1220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1221);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_createFileFormat);
		try {
			setState(1229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1223);
				match(STORED);
				setState(1224);
				match(AS);
				setState(1225);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1226);
				match(STORED);
				setState(1227);
				match(BY);
				setState(1228);
				storageHandler();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGenericFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGenericFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fileFormat);
		try {
			setState(1236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1231);
				match(INPUTFORMAT);
				setState(1232);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1233);
				match(OUTPUTFORMAT);
				setState(1234);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1235);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStorageHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStorageHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			match(STRING);
			setState(1242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1239);
				match(WITH);
				setState(1240);
				match(SERDEPROPERTIES);
				setState(1241);
				tablePropertyList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			identifier();
			setState(1245);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryNoWithContext extends ParserRuleContext {
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
	 
		public QueryNoWithContext() { }
		public void copyFrom(QueryNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleInsertQueryContext extends QueryNoWithContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public SingleInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiInsertQueryContext extends QueryNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_queryNoWith);
		int _la;
		try {
			setState(1259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INSERT) {
					{
					setState(1247);
					insertInto();
					}
				}

				setState(1250);
				queryTerm(0);
				setState(1251);
				queryOrganization();
				}
				break;
			case 2:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1253);
				fromClause();
				setState(1255); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1254);
					multiInsertQueryBody();
					}
					}
					setState(1257); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SELECT || _la==FROM || _la==INSERT || _la==MAP || _la==REDUCE );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_queryOrganization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1261);
				match(ORDER);
				setState(1262);
				match(BY);
				setState(1263);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1264);
					match(T__2);
					setState(1265);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(1270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTER) {
				{
				setState(1273);
				match(CLUSTER);
				setState(1274);
				match(BY);
				setState(1275);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1276);
					match(T__2);
					setState(1277);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(1282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTRIBUTE) {
				{
				setState(1285);
				match(DISTRIBUTE);
				setState(1286);
				match(BY);
				setState(1287);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1288);
					match(T__2);
					setState(1289);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(1294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(1297);
				match(SORT);
				setState(1298);
				match(BY);
				setState(1299);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1300);
					match(T__2);
					setState(1301);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(1306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(1309);
				windows();
				}
			}

			setState(1317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1312);
				match(LIMIT);
				setState(1315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1313);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1314);
					((QueryOrganizationContext)_localctx).limit = expression();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiInsertQueryBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiInsertQueryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_multiInsertQueryBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSERT) {
				{
				setState(1319);
				insertInto();
				}
			}

			setState(1322);
			querySpecification();
			setState(1323);
			queryOrganization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1326);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
					((SetOperationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
					setState(1328);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1329);
					((SetOperationContext)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (UNION - 99)) | (1L << (EXCEPT - 99)) | (1L << (SETMINUS - 99)) | (1L << (INTERSECT - 99)))) != 0)) ) {
						((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1331);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL || _la==DISTINCT) {
						{
						setState(1330);
						setQuantifier();
						}
					}

					setState(1333);
					((SetOperationContext)_localctx).right = queryTerm(2);
					}
					} 
				}
				setState(1338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTableDefault1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_queryPrimary);
		try {
			setState(1347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case MAP:
			case REDUCE:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1339);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1340);
				match(TABLE);
				setState(1341);
				tableIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1342);
				inlineTable();
				}
				break;
			case T__0:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1343);
				match(T__0);
				setState(1344);
				queryNoWith();
				setState(1345);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
			expression();
			setState(1351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1350);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(1353);
				match(NULLS);
				setState(1354);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecificationContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public BooleanExpressionContext where;
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public BooleanExpressionContext having;
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationContext aggregation() {
			return getRuleContext(AggregationContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_querySpecification);
		int _la;
		try {
			int _alt;
			setState(1450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(1367);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1357);
					match(SELECT);
					setState(1358);
					((QuerySpecificationContext)_localctx).kind = match(TRANSFORM);
					setState(1359);
					match(T__0);
					setState(1360);
					namedExpressionSeq();
					setState(1361);
					match(T__1);
					}
					break;
				case MAP:
					{
					setState(1363);
					((QuerySpecificationContext)_localctx).kind = match(MAP);
					setState(1364);
					namedExpressionSeq();
					}
					break;
				case REDUCE:
					{
					setState(1365);
					((QuerySpecificationContext)_localctx).kind = match(REDUCE);
					setState(1366);
					namedExpressionSeq();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1369);
					((QuerySpecificationContext)_localctx).inRowFormat = rowFormat();
					}
				}

				setState(1374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RECORDWRITER) {
					{
					setState(1372);
					match(RECORDWRITER);
					setState(1373);
					((QuerySpecificationContext)_localctx).recordWriter = match(STRING);
					}
				}

				setState(1376);
				match(USING);
				setState(1377);
				((QuerySpecificationContext)_localctx).script = match(STRING);
				setState(1390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1378);
					match(AS);
					setState(1388);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
					case 1:
						{
						setState(1379);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1380);
						colTypeList();
						}
						break;
					case 3:
						{
						{
						setState(1381);
						match(T__0);
						setState(1384);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
						case 1:
							{
							setState(1382);
							identifierSeq();
							}
							break;
						case 2:
							{
							setState(1383);
							colTypeList();
							}
							break;
						}
						setState(1386);
						match(T__1);
						}
						}
						break;
					}
					}
					break;
				}
				setState(1393);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1392);
					((QuerySpecificationContext)_localctx).outRowFormat = rowFormat();
					}
					break;
				}
				setState(1397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1395);
					match(RECORDREADER);
					setState(1396);
					((QuerySpecificationContext)_localctx).recordReader = match(STRING);
					}
					break;
				}
				setState(1400);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1399);
					fromClause();
					}
					break;
				}
				setState(1404);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1402);
					match(WHERE);
					setState(1403);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1428);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1406);
					((QuerySpecificationContext)_localctx).kind = match(SELECT);
					setState(1410);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(1407);
						((QuerySpecificationContext)_localctx).hint = hint();
						((QuerySpecificationContext)_localctx).hints.add(((QuerySpecificationContext)_localctx).hint);
						}
						}
						setState(1412);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1414);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
					case 1:
						{
						setState(1413);
						setQuantifier();
						}
						break;
					}
					setState(1416);
					namedExpressionSeq();
					setState(1418);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
					case 1:
						{
						setState(1417);
						fromClause();
						}
						break;
					}
					}
					break;
				case FROM:
					{
					setState(1420);
					fromClause();
					setState(1426);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
					case 1:
						{
						setState(1421);
						((QuerySpecificationContext)_localctx).kind = match(SELECT);
						setState(1423);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
						case 1:
							{
							setState(1422);
							setQuantifier();
							}
							break;
						}
						setState(1425);
						namedExpressionSeq();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1430);
						lateralView();
						}
						} 
					}
					setState(1435);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				}
				setState(1438);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1436);
					match(WHERE);
					setState(1437);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				setState(1441);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1440);
					aggregation();
					}
					break;
				}
				setState(1445);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1443);
					match(HAVING);
					setState(1444);
					((QuerySpecificationContext)_localctx).having = booleanExpression(0);
					}
					break;
				}
				setState(1448);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1447);
					windows();
					}
					break;
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_hint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			match(T__4);
			setState(1453);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DIV - 139)) | (1L << (PERCENTLIT - 139)) | (1L << (BUCKET - 139)) | (1L << (OUT - 139)) | (1L << (OF - 139)) | (1L << (SORT - 139)) | (1L << (CLUSTER - 139)) | (1L << (DISTRIBUTE - 139)) | (1L << (OVERWRITE - 139)) | (1L << (TRANSFORM - 139)) | (1L << (REDUCE - 139)) | (1L << (SERDE - 139)) | (1L << (SERDEPROPERTIES - 139)) | (1L << (RECORDREADER - 139)) | (1L << (RECORDWRITER - 139)) | (1L << (DELIMITED - 139)) | (1L << (FIELDS - 139)) | (1L << (TERMINATED - 139)) | (1L << (COLLECTION - 139)) | (1L << (ITEMS - 139)) | (1L << (KEYS - 139)) | (1L << (ESCAPED - 139)) | (1L << (LINES - 139)) | (1L << (SEPARATED - 139)) | (1L << (FUNCTION - 139)) | (1L << (EXTENDED - 139)) | (1L << (REFRESH - 139)) | (1L << (CLEAR - 139)) | (1L << (CACHE - 139)) | (1L << (UNCACHE - 139)) | (1L << (LAZY - 139)) | (1L << (FORMATTED - 139)) | (1L << (GLOBAL - 139)) | (1L << (TEMPORARY - 139)) | (1L << (OPTIONS - 139)) | (1L << (UNSET - 139)) | (1L << (TBLPROPERTIES - 139)) | (1L << (DBPROPERTIES - 139)) | (1L << (BUCKETS - 139)) | (1L << (SKEWED - 139)) | (1L << (STORED - 139)) | (1L << (DIRECTORIES - 139)) | (1L << (LOCATION - 139)) | (1L << (EXCHANGE - 139)) | (1L << (ARCHIVE - 139)) | (1L << (UNARCHIVE - 139)) | (1L << (FILEFORMAT - 139)) | (1L << (TOUCH - 139)) | (1L << (COMPACT - 139)) | (1L << (CONCATENATE - 139)) | (1L << (CHANGE - 139)) | (1L << (CASCADE - 139)) | (1L << (RESTRICT - 139)) | (1L << (CLUSTERED - 139)) | (1L << (SORTED - 139)) | (1L << (PURGE - 139)) | (1L << (INPUTFORMAT - 139)) | (1L << (OUTPUTFORMAT - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (DATABASE - 203)) | (1L << (DATABASES - 203)) | (1L << (DFS - 203)) | (1L << (TRUNCATE - 203)) | (1L << (ANALYZE - 203)) | (1L << (COMPUTE - 203)) | (1L << (LIST - 203)) | (1L << (STATISTICS - 203)) | (1L << (PARTITIONED - 203)) | (1L << (EXTERNAL - 203)) | (1L << (DEFINED - 203)) | (1L << (REVOKE - 203)) | (1L << (GRANT - 203)) | (1L << (LOCK - 203)) | (1L << (UNLOCK - 203)) | (1L << (MSCK - 203)) | (1L << (REPAIR - 203)) | (1L << (RECOVER - 203)) | (1L << (EXPORT - 203)) | (1L << (IMPORT - 203)) | (1L << (LOAD - 203)) | (1L << (ROLE - 203)) | (1L << (ROLES - 203)) | (1L << (COMPACTIONS - 203)) | (1L << (PRINCIPALS - 203)) | (1L << (TRANSACTIONS - 203)) | (1L << (INDEX - 203)) | (1L << (INDEXES - 203)) | (1L << (LOCKS - 203)) | (1L << (OPTION - 203)) | (1L << (ANTI - 203)) | (1L << (LOCAL - 203)) | (1L << (INPATH - 203)) | (1L << (IDENTIFIER - 203)) | (1L << (BACKQUOTED_IDENTIFIER - 203)))) != 0)) {
				{
				{
				setState(1455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1454);
					match(T__2);
					}
				}

				setState(1457);
				((HintContext)_localctx).hintStatement = hintStatement();
				((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
				}
				}
				setState(1462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1463);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_hintStatement);
		int _la;
		try {
			setState(1478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1465);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1466);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1467);
				match(T__0);
				setState(1468);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1469);
					match(T__2);
					setState(1470);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1475);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1476);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			match(FROM);
			setState(1481);
			relation();
			setState(1486);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1482);
					match(T__2);
					setState(1483);
					relation();
					}
					} 
				}
				setState(1488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			}
			setState(1492);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1489);
					lateralView();
					}
					} 
				}
				setState(1494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public AggregationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAggregation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAggregation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAggregation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationContext aggregation() throws RecognitionException {
		AggregationContext _localctx = new AggregationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_aggregation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1495);
			match(GROUP);
			setState(1496);
			match(BY);
			setState(1497);
			((AggregationContext)_localctx).expression = expression();
			((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
			setState(1502);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1498);
					match(T__2);
					setState(1499);
					((AggregationContext)_localctx).expression = expression();
					((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
					}
					} 
				}
				setState(1504);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			}
			setState(1522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1505);
				match(WITH);
				setState(1506);
				((AggregationContext)_localctx).kind = match(ROLLUP);
				}
				break;
			case 2:
				{
				setState(1507);
				match(WITH);
				setState(1508);
				((AggregationContext)_localctx).kind = match(CUBE);
				}
				break;
			case 3:
				{
				setState(1509);
				((AggregationContext)_localctx).kind = match(GROUPING);
				setState(1510);
				match(SETS);
				setState(1511);
				match(T__0);
				setState(1512);
				groupingSet();
				setState(1517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1513);
					match(T__2);
					setState(1514);
					groupingSet();
					}
					}
					setState(1519);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1520);
				match(T__1);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_groupingSet);
		int _la;
		try {
			setState(1537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1524);
				match(T__0);
				setState(1533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (PLUS - 134)) | (1L << (MINUS - 134)) | (1L << (ASTERISK - 134)) | (1L << (DIV - 134)) | (1L << (TILDE - 134)) | (1L << (PERCENTLIT - 134)) | (1L << (BUCKET - 134)) | (1L << (OUT - 134)) | (1L << (OF - 134)) | (1L << (SORT - 134)) | (1L << (CLUSTER - 134)) | (1L << (DISTRIBUTE - 134)) | (1L << (OVERWRITE - 134)) | (1L << (TRANSFORM - 134)) | (1L << (REDUCE - 134)) | (1L << (SERDE - 134)) | (1L << (SERDEPROPERTIES - 134)) | (1L << (RECORDREADER - 134)) | (1L << (RECORDWRITER - 134)) | (1L << (DELIMITED - 134)) | (1L << (FIELDS - 134)) | (1L << (TERMINATED - 134)) | (1L << (COLLECTION - 134)) | (1L << (ITEMS - 134)) | (1L << (KEYS - 134)) | (1L << (ESCAPED - 134)) | (1L << (LINES - 134)) | (1L << (SEPARATED - 134)) | (1L << (FUNCTION - 134)) | (1L << (EXTENDED - 134)) | (1L << (REFRESH - 134)) | (1L << (CLEAR - 134)) | (1L << (CACHE - 134)) | (1L << (UNCACHE - 134)) | (1L << (LAZY - 134)) | (1L << (FORMATTED - 134)) | (1L << (GLOBAL - 134)) | (1L << (TEMPORARY - 134)) | (1L << (OPTIONS - 134)) | (1L << (UNSET - 134)) | (1L << (TBLPROPERTIES - 134)) | (1L << (DBPROPERTIES - 134)) | (1L << (BUCKETS - 134)) | (1L << (SKEWED - 134)) | (1L << (STORED - 134)) | (1L << (DIRECTORIES - 134)) | (1L << (LOCATION - 134)) | (1L << (EXCHANGE - 134)) | (1L << (ARCHIVE - 134)) | (1L << (UNARCHIVE - 134)) | (1L << (FILEFORMAT - 134)) | (1L << (TOUCH - 134)) | (1L << (COMPACT - 134)) | (1L << (CONCATENATE - 134)) | (1L << (CHANGE - 134)) | (1L << (CASCADE - 134)) | (1L << (RESTRICT - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (CLUSTERED - 198)) | (1L << (SORTED - 198)) | (1L << (PURGE - 198)) | (1L << (INPUTFORMAT - 198)) | (1L << (OUTPUTFORMAT - 198)) | (1L << (DATABASE - 198)) | (1L << (DATABASES - 198)) | (1L << (DFS - 198)) | (1L << (TRUNCATE - 198)) | (1L << (ANALYZE - 198)) | (1L << (COMPUTE - 198)) | (1L << (LIST - 198)) | (1L << (STATISTICS - 198)) | (1L << (PARTITIONED - 198)) | (1L << (EXTERNAL - 198)) | (1L << (DEFINED - 198)) | (1L << (REVOKE - 198)) | (1L << (GRANT - 198)) | (1L << (LOCK - 198)) | (1L << (UNLOCK - 198)) | (1L << (MSCK - 198)) | (1L << (REPAIR - 198)) | (1L << (RECOVER - 198)) | (1L << (EXPORT - 198)) | (1L << (IMPORT - 198)) | (1L << (LOAD - 198)) | (1L << (ROLE - 198)) | (1L << (ROLES - 198)) | (1L << (COMPACTIONS - 198)) | (1L << (PRINCIPALS - 198)) | (1L << (TRANSACTIONS - 198)) | (1L << (INDEX - 198)) | (1L << (INDEXES - 198)) | (1L << (LOCKS - 198)) | (1L << (OPTION - 198)) | (1L << (ANTI - 198)) | (1L << (LOCAL - 198)) | (1L << (INPATH - 198)) | (1L << (STRING - 198)) | (1L << (BIGINT_LITERAL - 198)) | (1L << (SMALLINT_LITERAL - 198)) | (1L << (TINYINT_LITERAL - 198)) | (1L << (INTEGER_VALUE - 198)) | (1L << (DECIMAL_VALUE - 198)) | (1L << (DOUBLE_LITERAL - 198)) | (1L << (BIGDECIMAL_LITERAL - 198)) | (1L << (IDENTIFIER - 198)) | (1L << (BACKQUOTED_IDENTIFIER - 198)))) != 0)) {
					{
					setState(1525);
					expression();
					setState(1530);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1526);
						match(T__2);
						setState(1527);
						expression();
						}
						}
						setState(1532);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1535);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1536);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLateralView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLateralView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
			match(LATERAL);
			setState(1540);
			match(VIEW);
			setState(1542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1541);
				match(OUTER);
				}
				break;
			}
			setState(1544);
			qualifiedName();
			setState(1545);
			match(T__0);
			setState(1554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (PLUS - 134)) | (1L << (MINUS - 134)) | (1L << (ASTERISK - 134)) | (1L << (DIV - 134)) | (1L << (TILDE - 134)) | (1L << (PERCENTLIT - 134)) | (1L << (BUCKET - 134)) | (1L << (OUT - 134)) | (1L << (OF - 134)) | (1L << (SORT - 134)) | (1L << (CLUSTER - 134)) | (1L << (DISTRIBUTE - 134)) | (1L << (OVERWRITE - 134)) | (1L << (TRANSFORM - 134)) | (1L << (REDUCE - 134)) | (1L << (SERDE - 134)) | (1L << (SERDEPROPERTIES - 134)) | (1L << (RECORDREADER - 134)) | (1L << (RECORDWRITER - 134)) | (1L << (DELIMITED - 134)) | (1L << (FIELDS - 134)) | (1L << (TERMINATED - 134)) | (1L << (COLLECTION - 134)) | (1L << (ITEMS - 134)) | (1L << (KEYS - 134)) | (1L << (ESCAPED - 134)) | (1L << (LINES - 134)) | (1L << (SEPARATED - 134)) | (1L << (FUNCTION - 134)) | (1L << (EXTENDED - 134)) | (1L << (REFRESH - 134)) | (1L << (CLEAR - 134)) | (1L << (CACHE - 134)) | (1L << (UNCACHE - 134)) | (1L << (LAZY - 134)) | (1L << (FORMATTED - 134)) | (1L << (GLOBAL - 134)) | (1L << (TEMPORARY - 134)) | (1L << (OPTIONS - 134)) | (1L << (UNSET - 134)) | (1L << (TBLPROPERTIES - 134)) | (1L << (DBPROPERTIES - 134)) | (1L << (BUCKETS - 134)) | (1L << (SKEWED - 134)) | (1L << (STORED - 134)) | (1L << (DIRECTORIES - 134)) | (1L << (LOCATION - 134)) | (1L << (EXCHANGE - 134)) | (1L << (ARCHIVE - 134)) | (1L << (UNARCHIVE - 134)) | (1L << (FILEFORMAT - 134)) | (1L << (TOUCH - 134)) | (1L << (COMPACT - 134)) | (1L << (CONCATENATE - 134)) | (1L << (CHANGE - 134)) | (1L << (CASCADE - 134)) | (1L << (RESTRICT - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (CLUSTERED - 198)) | (1L << (SORTED - 198)) | (1L << (PURGE - 198)) | (1L << (INPUTFORMAT - 198)) | (1L << (OUTPUTFORMAT - 198)) | (1L << (DATABASE - 198)) | (1L << (DATABASES - 198)) | (1L << (DFS - 198)) | (1L << (TRUNCATE - 198)) | (1L << (ANALYZE - 198)) | (1L << (COMPUTE - 198)) | (1L << (LIST - 198)) | (1L << (STATISTICS - 198)) | (1L << (PARTITIONED - 198)) | (1L << (EXTERNAL - 198)) | (1L << (DEFINED - 198)) | (1L << (REVOKE - 198)) | (1L << (GRANT - 198)) | (1L << (LOCK - 198)) | (1L << (UNLOCK - 198)) | (1L << (MSCK - 198)) | (1L << (REPAIR - 198)) | (1L << (RECOVER - 198)) | (1L << (EXPORT - 198)) | (1L << (IMPORT - 198)) | (1L << (LOAD - 198)) | (1L << (ROLE - 198)) | (1L << (ROLES - 198)) | (1L << (COMPACTIONS - 198)) | (1L << (PRINCIPALS - 198)) | (1L << (TRANSACTIONS - 198)) | (1L << (INDEX - 198)) | (1L << (INDEXES - 198)) | (1L << (LOCKS - 198)) | (1L << (OPTION - 198)) | (1L << (ANTI - 198)) | (1L << (LOCAL - 198)) | (1L << (INPATH - 198)) | (1L << (STRING - 198)) | (1L << (BIGINT_LITERAL - 198)) | (1L << (SMALLINT_LITERAL - 198)) | (1L << (TINYINT_LITERAL - 198)) | (1L << (INTEGER_VALUE - 198)) | (1L << (DECIMAL_VALUE - 198)) | (1L << (DOUBLE_LITERAL - 198)) | (1L << (BIGDECIMAL_LITERAL - 198)) | (1L << (IDENTIFIER - 198)) | (1L << (BACKQUOTED_IDENTIFIER - 198)))) != 0)) {
				{
				setState(1546);
				expression();
				setState(1551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1547);
					match(T__2);
					setState(1548);
					expression();
					}
					}
					setState(1553);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1556);
			match(T__1);
			setState(1557);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(1569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1559);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1558);
					match(AS);
					}
					break;
				}
				setState(1561);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(1566);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1562);
						match(T__2);
						setState(1563);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(1568);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1571);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
			relationPrimary();
			setState(1577);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1574);
					joinRelation();
					}
					} 
				}
				setState(1579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_joinRelation);
		try {
			setState(1591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case CROSS:
			case INNER:
			case LEFT:
			case RIGHT:
			case FULL:
			case ANTI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1580);
				joinType();
				}
				setState(1581);
				match(JOIN);
				setState(1582);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(1584);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1583);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1586);
				match(NATURAL);
				setState(1587);
				joinType();
				setState(1588);
				match(JOIN);
				setState(1589);
				((JoinRelationContext)_localctx).right = relationPrimary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_joinType);
		int _la;
		try {
			setState(1615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1593);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1596);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1597);
				match(LEFT);
				setState(1599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1598);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1601);
				match(LEFT);
				setState(1602);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1603);
				match(RIGHT);
				setState(1605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1604);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1607);
				match(FULL);
				setState(1609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1608);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(1611);
					match(LEFT);
					}
				}

				setState(1614);
				match(ANTI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_joinCriteria);
		int _la;
		try {
			setState(1631);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1617);
				match(ON);
				setState(1618);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1619);
				match(USING);
				setState(1620);
				match(T__0);
				setState(1621);
				identifier();
				setState(1626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1622);
					match(T__2);
					setState(1623);
					identifier();
					}
					}
					setState(1628);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1629);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleContext extends ParserRuleContext {
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public SampleMethodContext sampleMethod() {
			return getRuleContext(SampleMethodContext.class,0);
		}
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_sample);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			match(TABLESAMPLE);
			setState(1634);
			match(T__0);
			setState(1636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (PLUS - 134)) | (1L << (MINUS - 134)) | (1L << (ASTERISK - 134)) | (1L << (DIV - 134)) | (1L << (TILDE - 134)) | (1L << (PERCENTLIT - 134)) | (1L << (BUCKET - 134)) | (1L << (OUT - 134)) | (1L << (OF - 134)) | (1L << (SORT - 134)) | (1L << (CLUSTER - 134)) | (1L << (DISTRIBUTE - 134)) | (1L << (OVERWRITE - 134)) | (1L << (TRANSFORM - 134)) | (1L << (REDUCE - 134)) | (1L << (SERDE - 134)) | (1L << (SERDEPROPERTIES - 134)) | (1L << (RECORDREADER - 134)) | (1L << (RECORDWRITER - 134)) | (1L << (DELIMITED - 134)) | (1L << (FIELDS - 134)) | (1L << (TERMINATED - 134)) | (1L << (COLLECTION - 134)) | (1L << (ITEMS - 134)) | (1L << (KEYS - 134)) | (1L << (ESCAPED - 134)) | (1L << (LINES - 134)) | (1L << (SEPARATED - 134)) | (1L << (FUNCTION - 134)) | (1L << (EXTENDED - 134)) | (1L << (REFRESH - 134)) | (1L << (CLEAR - 134)) | (1L << (CACHE - 134)) | (1L << (UNCACHE - 134)) | (1L << (LAZY - 134)) | (1L << (FORMATTED - 134)) | (1L << (GLOBAL - 134)) | (1L << (TEMPORARY - 134)) | (1L << (OPTIONS - 134)) | (1L << (UNSET - 134)) | (1L << (TBLPROPERTIES - 134)) | (1L << (DBPROPERTIES - 134)) | (1L << (BUCKETS - 134)) | (1L << (SKEWED - 134)) | (1L << (STORED - 134)) | (1L << (DIRECTORIES - 134)) | (1L << (LOCATION - 134)) | (1L << (EXCHANGE - 134)) | (1L << (ARCHIVE - 134)) | (1L << (UNARCHIVE - 134)) | (1L << (FILEFORMAT - 134)) | (1L << (TOUCH - 134)) | (1L << (COMPACT - 134)) | (1L << (CONCATENATE - 134)) | (1L << (CHANGE - 134)) | (1L << (CASCADE - 134)) | (1L << (RESTRICT - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (CLUSTERED - 198)) | (1L << (SORTED - 198)) | (1L << (PURGE - 198)) | (1L << (INPUTFORMAT - 198)) | (1L << (OUTPUTFORMAT - 198)) | (1L << (DATABASE - 198)) | (1L << (DATABASES - 198)) | (1L << (DFS - 198)) | (1L << (TRUNCATE - 198)) | (1L << (ANALYZE - 198)) | (1L << (COMPUTE - 198)) | (1L << (LIST - 198)) | (1L << (STATISTICS - 198)) | (1L << (PARTITIONED - 198)) | (1L << (EXTERNAL - 198)) | (1L << (DEFINED - 198)) | (1L << (REVOKE - 198)) | (1L << (GRANT - 198)) | (1L << (LOCK - 198)) | (1L << (UNLOCK - 198)) | (1L << (MSCK - 198)) | (1L << (REPAIR - 198)) | (1L << (RECOVER - 198)) | (1L << (EXPORT - 198)) | (1L << (IMPORT - 198)) | (1L << (LOAD - 198)) | (1L << (ROLE - 198)) | (1L << (ROLES - 198)) | (1L << (COMPACTIONS - 198)) | (1L << (PRINCIPALS - 198)) | (1L << (TRANSACTIONS - 198)) | (1L << (INDEX - 198)) | (1L << (INDEXES - 198)) | (1L << (LOCKS - 198)) | (1L << (OPTION - 198)) | (1L << (ANTI - 198)) | (1L << (LOCAL - 198)) | (1L << (INPATH - 198)) | (1L << (STRING - 198)) | (1L << (BIGINT_LITERAL - 198)) | (1L << (SMALLINT_LITERAL - 198)) | (1L << (TINYINT_LITERAL - 198)) | (1L << (INTEGER_VALUE - 198)) | (1L << (DECIMAL_VALUE - 198)) | (1L << (DOUBLE_LITERAL - 198)) | (1L << (BIGDECIMAL_LITERAL - 198)) | (1L << (IDENTIFIER - 198)) | (1L << (BACKQUOTED_IDENTIFIER - 198)))) != 0)) {
				{
				setState(1635);
				sampleMethod();
				}
			}

			setState(1638);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleMethodContext extends ParserRuleContext {
		public SampleMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleMethod; }
	 
		public SampleMethodContext() { }
		public void copyFrom(SampleMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SampleByRowsContext extends SampleMethodContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public SampleByRowsContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByRows(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByPercentileContext extends SampleMethodContext {
		public Token negativeSign;
		public Token percentage;
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SampleByPercentileContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByPercentile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByPercentile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByPercentile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBucketContext extends SampleMethodContext {
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SampleByBucketContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByBucket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByBucket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByBucket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBytesContext extends SampleMethodContext {
		public ExpressionContext bytes;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampleByBytesContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByBytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByBytes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleMethodContext sampleMethod() throws RecognitionException {
		SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_sampleMethod);
		int _la;
		try {
			setState(1664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1640);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(1643);
				((SampleByPercentileContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleByPercentileContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1644);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1645);
				expression();
				setState(1646);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1648);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(1649);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(1650);
				match(OUT);
				setState(1651);
				match(OF);
				setState(1652);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(1661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1653);
					match(ON);
					setState(1659);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
					case 1:
						{
						setState(1654);
						identifier();
						}
						break;
					case 2:
						{
						setState(1655);
						qualifiedName();
						setState(1656);
						match(T__0);
						setState(1657);
						match(T__1);
						}
						break;
					}
					}
				}

				}
				break;
			case 4:
				_localctx = new SampleByBytesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1663);
				((SampleByBytesContext)_localctx).bytes = expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
			match(T__0);
			setState(1667);
			identifierSeq();
			setState(1668);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierSeqContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1670);
			identifier();
			setState(1675);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1671);
					match(T__2);
					setState(1672);
					identifier();
					}
					} 
				}
				setState(1677);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOrderedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1678);
			match(T__0);
			setState(1679);
			orderedIdentifier();
			setState(1684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1680);
				match(T__2);
				setState(1681);
				orderedIdentifier();
				}
				}
				setState(1686);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1687);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierContext extends ParserRuleContext {
		public Token ordering;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOrderedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689);
			identifier();
			setState(1691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1690);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentListContext extends ParserRuleContext {
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierCommentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierCommentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
			match(T__0);
			setState(1694);
			identifierComment();
			setState(1699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1695);
				match(T__2);
				setState(1696);
				identifierComment();
				}
				}
				setState(1701);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1702);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			identifier();
			setState(1707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1705);
				match(COMMENT);
				setState(1706);
				match(STRING);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public FunctionTableContext functionTable() {
			return getRuleContext(FunctionTableContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableValuedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableValuedFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_relationPrimary);
		try {
			setState(1733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1709);
				tableIdentifier();
				setState(1711);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1710);
					sample();
					}
					break;
				}
				setState(1713);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1715);
				match(T__0);
				setState(1716);
				queryNoWith();
				setState(1717);
				match(T__1);
				setState(1719);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1718);
					sample();
					}
					break;
				}
				setState(1721);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1723);
				match(T__0);
				setState(1724);
				relation();
				setState(1725);
				match(T__1);
				setState(1727);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1726);
					sample();
					}
					break;
				}
				setState(1729);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1731);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1732);
				functionTable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1735);
			match(VALUES);
			setState(1736);
			expression();
			setState(1741);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1737);
					match(T__2);
					setState(1738);
					expression();
					}
					} 
				}
				setState(1743);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			}
			setState(1744);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTableContext functionTable() throws RecognitionException {
		FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1746);
			identifier();
			setState(1747);
			match(T__0);
			setState(1756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (PLUS - 134)) | (1L << (MINUS - 134)) | (1L << (ASTERISK - 134)) | (1L << (DIV - 134)) | (1L << (TILDE - 134)) | (1L << (PERCENTLIT - 134)) | (1L << (BUCKET - 134)) | (1L << (OUT - 134)) | (1L << (OF - 134)) | (1L << (SORT - 134)) | (1L << (CLUSTER - 134)) | (1L << (DISTRIBUTE - 134)) | (1L << (OVERWRITE - 134)) | (1L << (TRANSFORM - 134)) | (1L << (REDUCE - 134)) | (1L << (SERDE - 134)) | (1L << (SERDEPROPERTIES - 134)) | (1L << (RECORDREADER - 134)) | (1L << (RECORDWRITER - 134)) | (1L << (DELIMITED - 134)) | (1L << (FIELDS - 134)) | (1L << (TERMINATED - 134)) | (1L << (COLLECTION - 134)) | (1L << (ITEMS - 134)) | (1L << (KEYS - 134)) | (1L << (ESCAPED - 134)) | (1L << (LINES - 134)) | (1L << (SEPARATED - 134)) | (1L << (FUNCTION - 134)) | (1L << (EXTENDED - 134)) | (1L << (REFRESH - 134)) | (1L << (CLEAR - 134)) | (1L << (CACHE - 134)) | (1L << (UNCACHE - 134)) | (1L << (LAZY - 134)) | (1L << (FORMATTED - 134)) | (1L << (GLOBAL - 134)) | (1L << (TEMPORARY - 134)) | (1L << (OPTIONS - 134)) | (1L << (UNSET - 134)) | (1L << (TBLPROPERTIES - 134)) | (1L << (DBPROPERTIES - 134)) | (1L << (BUCKETS - 134)) | (1L << (SKEWED - 134)) | (1L << (STORED - 134)) | (1L << (DIRECTORIES - 134)) | (1L << (LOCATION - 134)) | (1L << (EXCHANGE - 134)) | (1L << (ARCHIVE - 134)) | (1L << (UNARCHIVE - 134)) | (1L << (FILEFORMAT - 134)) | (1L << (TOUCH - 134)) | (1L << (COMPACT - 134)) | (1L << (CONCATENATE - 134)) | (1L << (CHANGE - 134)) | (1L << (CASCADE - 134)) | (1L << (RESTRICT - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (CLUSTERED - 198)) | (1L << (SORTED - 198)) | (1L << (PURGE - 198)) | (1L << (INPUTFORMAT - 198)) | (1L << (OUTPUTFORMAT - 198)) | (1L << (DATABASE - 198)) | (1L << (DATABASES - 198)) | (1L << (DFS - 198)) | (1L << (TRUNCATE - 198)) | (1L << (ANALYZE - 198)) | (1L << (COMPUTE - 198)) | (1L << (LIST - 198)) | (1L << (STATISTICS - 198)) | (1L << (PARTITIONED - 198)) | (1L << (EXTERNAL - 198)) | (1L << (DEFINED - 198)) | (1L << (REVOKE - 198)) | (1L << (GRANT - 198)) | (1L << (LOCK - 198)) | (1L << (UNLOCK - 198)) | (1L << (MSCK - 198)) | (1L << (REPAIR - 198)) | (1L << (RECOVER - 198)) | (1L << (EXPORT - 198)) | (1L << (IMPORT - 198)) | (1L << (LOAD - 198)) | (1L << (ROLE - 198)) | (1L << (ROLES - 198)) | (1L << (COMPACTIONS - 198)) | (1L << (PRINCIPALS - 198)) | (1L << (TRANSACTIONS - 198)) | (1L << (INDEX - 198)) | (1L << (INDEXES - 198)) | (1L << (LOCKS - 198)) | (1L << (OPTION - 198)) | (1L << (ANTI - 198)) | (1L << (LOCAL - 198)) | (1L << (INPATH - 198)) | (1L << (STRING - 198)) | (1L << (BIGINT_LITERAL - 198)) | (1L << (SMALLINT_LITERAL - 198)) | (1L << (TINYINT_LITERAL - 198)) | (1L << (INTEGER_VALUE - 198)) | (1L << (DECIMAL_VALUE - 198)) | (1L << (DOUBLE_LITERAL - 198)) | (1L << (BIGDECIMAL_LITERAL - 198)) | (1L << (IDENTIFIER - 198)) | (1L << (BACKQUOTED_IDENTIFIER - 198)))) != 0)) {
				{
				setState(1748);
				expression();
				setState(1753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1749);
					match(T__2);
					setState(1750);
					expression();
					}
					}
					setState(1755);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1758);
			match(T__1);
			setState(1759);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableAliasContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				{
				setState(1762);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(1761);
					match(AS);
					}
					break;
				}
				setState(1764);
				strictIdentifier();
				setState(1766);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
				case 1:
					{
					setState(1765);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowFormatSerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowFormatSerde(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(SqlBaseParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(SqlBaseParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowFormatDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowFormatDelimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_rowFormat);
		try {
			setState(1819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1770);
				match(ROW);
				setState(1771);
				match(FORMAT);
				setState(1772);
				match(SERDE);
				setState(1773);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(1777);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(1774);
					match(WITH);
					setState(1775);
					match(SERDEPROPERTIES);
					setState(1776);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1779);
				match(ROW);
				setState(1780);
				match(FORMAT);
				setState(1781);
				match(DELIMITED);
				setState(1791);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(1782);
					match(FIELDS);
					setState(1783);
					match(TERMINATED);
					setState(1784);
					match(BY);
					setState(1785);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(1789);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
					case 1:
						{
						setState(1786);
						match(ESCAPED);
						setState(1787);
						match(BY);
						setState(1788);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(1798);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(1793);
					match(COLLECTION);
					setState(1794);
					match(ITEMS);
					setState(1795);
					match(TERMINATED);
					setState(1796);
					match(BY);
					setState(1797);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1805);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(1800);
					match(MAP);
					setState(1801);
					match(KEYS);
					setState(1802);
					match(TERMINATED);
					setState(1803);
					match(BY);
					setState(1804);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1811);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(1807);
					match(LINES);
					setState(1808);
					match(TERMINATED);
					setState(1809);
					match(BY);
					setState(1810);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(1817);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(1813);
					match(NULL);
					setState(1814);
					match(DEFINED);
					setState(1815);
					match(AS);
					setState(1816);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext table;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(1821);
				((TableIdentifierContext)_localctx).db = identifier();
				setState(1822);
				match(T__3);
				}
				break;
			}
			setState(1826);
			((TableIdentifierContext)_localctx).table = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext function;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				{
				setState(1828);
				((FunctionIdentifierContext)_localctx).db = identifier();
				setState(1829);
				match(T__3);
				}
				break;
			}
			setState(1833);
			((FunctionIdentifierContext)_localctx).function = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1835);
			expression();
			setState(1843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(1837);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(1836);
					match(AS);
					}
					break;
				}
				setState(1841);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
				case FROM:
				case ADD:
				case AS:
				case ALL:
				case DISTINCT:
				case WHERE:
				case GROUP:
				case BY:
				case GROUPING:
				case SETS:
				case CUBE:
				case ROLLUP:
				case ORDER:
				case HAVING:
				case LIMIT:
				case AT:
				case OR:
				case AND:
				case IN:
				case NOT:
				case NO:
				case EXISTS:
				case BETWEEN:
				case LIKE:
				case RLIKE:
				case IS:
				case NULL:
				case TRUE:
				case FALSE:
				case NULLS:
				case ASC:
				case DESC:
				case FOR:
				case INTERVAL:
				case CASE:
				case WHEN:
				case THEN:
				case ELSE:
				case END:
				case JOIN:
				case CROSS:
				case OUTER:
				case INNER:
				case LEFT:
				case SEMI:
				case RIGHT:
				case FULL:
				case NATURAL:
				case ON:
				case LATERAL:
				case WINDOW:
				case OVER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case UNBOUNDED:
				case PRECEDING:
				case FOLLOWING:
				case CURRENT:
				case FIRST:
				case AFTER:
				case LAST:
				case ROW:
				case WITH:
				case VALUES:
				case CREATE:
				case TABLE:
				case DIRECTORY:
				case VIEW:
				case REPLACE:
				case INSERT:
				case DELETE:
				case INTO:
				case DESCRIBE:
				case EXPLAIN:
				case FORMAT:
				case LOGICAL:
				case CODEGEN:
				case COST:
				case CAST:
				case SHOW:
				case TABLES:
				case COLUMNS:
				case COLUMN:
				case USE:
				case PARTITIONS:
				case FUNCTIONS:
				case DROP:
				case UNION:
				case EXCEPT:
				case SETMINUS:
				case INTERSECT:
				case TO:
				case TABLESAMPLE:
				case STRATIFY:
				case ALTER:
				case RENAME:
				case ARRAY:
				case MAP:
				case STRUCT:
				case COMMENT:
				case SET:
				case RESET:
				case DATA:
				case START:
				case TRANSACTION:
				case COMMIT:
				case ROLLBACK:
				case MACRO:
				case IGNORE:
				case BOTH:
				case LEADING:
				case TRAILING:
				case IF:
				case POSITION:
				case DIV:
				case PERCENTLIT:
				case BUCKET:
				case OUT:
				case OF:
				case SORT:
				case CLUSTER:
				case DISTRIBUTE:
				case OVERWRITE:
				case TRANSFORM:
				case REDUCE:
				case SERDE:
				case SERDEPROPERTIES:
				case RECORDREADER:
				case RECORDWRITER:
				case DELIMITED:
				case FIELDS:
				case TERMINATED:
				case COLLECTION:
				case ITEMS:
				case KEYS:
				case ESCAPED:
				case LINES:
				case SEPARATED:
				case FUNCTION:
				case EXTENDED:
				case REFRESH:
				case CLEAR:
				case CACHE:
				case UNCACHE:
				case LAZY:
				case FORMATTED:
				case GLOBAL:
				case TEMPORARY:
				case OPTIONS:
				case UNSET:
				case TBLPROPERTIES:
				case DBPROPERTIES:
				case BUCKETS:
				case SKEWED:
				case STORED:
				case DIRECTORIES:
				case LOCATION:
				case EXCHANGE:
				case ARCHIVE:
				case UNARCHIVE:
				case FILEFORMAT:
				case TOUCH:
				case COMPACT:
				case CONCATENATE:
				case CHANGE:
				case CASCADE:
				case RESTRICT:
				case CLUSTERED:
				case SORTED:
				case PURGE:
				case INPUTFORMAT:
				case OUTPUTFORMAT:
				case DATABASE:
				case DATABASES:
				case DFS:
				case TRUNCATE:
				case ANALYZE:
				case COMPUTE:
				case LIST:
				case STATISTICS:
				case PARTITIONED:
				case EXTERNAL:
				case DEFINED:
				case REVOKE:
				case GRANT:
				case LOCK:
				case UNLOCK:
				case MSCK:
				case REPAIR:
				case RECOVER:
				case EXPORT:
				case IMPORT:
				case LOAD:
				case ROLE:
				case ROLES:
				case COMPACTIONS:
				case PRINCIPALS:
				case TRANSACTIONS:
				case INDEX:
				case INDEXES:
				case LOCKS:
				case OPTION:
				case ANTI:
				case LOCAL:
				case INPATH:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(1839);
					identifier();
					}
					break;
				case T__0:
					{
					setState(1840);
					identifierList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1845);
			namedExpression();
			setState(1850);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1846);
					match(T__2);
					setState(1847);
					namedExpression();
					}
					} 
				}
				setState(1852);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1853);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanDefaultContext extends BooleanExpressionContext {
		public PredicatedContext predicated() {
			return getRuleContext(PredicatedContext.class,0);
		}
		public BooleanDefaultContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1856);
				match(NOT);
				setState(1857);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1858);
				match(EXISTS);
				setState(1859);
				match(T__0);
				setState(1860);
				query();
				setState(1861);
				match(T__1);
				}
				break;
			case 3:
				{
				_localctx = new BooleanDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1863);
				predicated();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1874);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1872);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1866);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1867);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(1868);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1869);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1870);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(1871);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(1876);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicatedContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicatedContext predicated() throws RecognitionException {
		PredicatedContext _localctx = new PredicatedContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_predicated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1877);
			valueExpression(0);
			setState(1879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(1878);
				predicate();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public ValueExpressionContext right;
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_predicate);
		int _la;
		try {
			setState(1929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1881);
					match(NOT);
					}
				}

				setState(1884);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(1885);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(1886);
				match(AND);
				setState(1887);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1889);
					match(NOT);
					}
				}

				setState(1892);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1893);
				match(T__0);
				setState(1894);
				expression();
				setState(1899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1895);
					match(T__2);
					setState(1896);
					expression();
					}
					}
					setState(1901);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1902);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1904);
					match(NOT);
					}
				}

				setState(1907);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1908);
				match(T__0);
				setState(1909);
				query();
				setState(1910);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1912);
					match(NOT);
					}
				}

				setState(1915);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==RLIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1916);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1917);
				match(IS);
				setState(1919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1918);
					match(NOT);
					}
				}

				setState(1921);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1922);
				match(IS);
				setState(1924);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1923);
					match(NOT);
					}
				}

				setState(1926);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(1927);
				match(FROM);
				setState(1928);
				((PredicateContext)_localctx).right = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1932);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1933);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (PLUS - 134)) | (1L << (MINUS - 134)) | (1L << (TILDE - 134)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1934);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1958);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1956);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1937);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1938);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (ASTERISK - 136)) | (1L << (SLASH - 136)) | (1L << (PERCENT - 136)) | (1L << (DIV - 136)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1939);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1940);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1941);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (PLUS - 134)) | (1L << (MINUS - 134)) | (1L << (CONCAT_PIPE - 134)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1942);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1943);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1944);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(1945);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1946);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1947);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(1948);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1949);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1950);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(1951);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1952);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1953);
						comparisonOperator();
						setState(1954);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(1960);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public Token trimOption;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 144;
		enterRecursionRule(_localctx, 144, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2085);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1962);
				match(CASE);
				setState(1964); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1963);
					whenClause();
					}
					}
					setState(1966); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1970);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1968);
					match(ELSE);
					setState(1969);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1972);
				match(END);
				}
				break;
			case 2:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1974);
				match(CASE);
				setState(1975);
				((SimpleCaseContext)_localctx).value = expression();
				setState(1977); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1976);
					whenClause();
					}
					}
					setState(1979); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1981);
					match(ELSE);
					setState(1982);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1985);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1987);
				match(CAST);
				setState(1988);
				match(T__0);
				setState(1989);
				expression();
				setState(1990);
				match(AS);
				setState(1991);
				dataType();
				setState(1992);
				match(T__1);
				}
				break;
			case 4:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1994);
				match(STRUCT);
				setState(1995);
				match(T__0);
				setState(2004);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (PLUS - 134)) | (1L << (MINUS - 134)) | (1L << (ASTERISK - 134)) | (1L << (DIV - 134)) | (1L << (TILDE - 134)) | (1L << (PERCENTLIT - 134)) | (1L << (BUCKET - 134)) | (1L << (OUT - 134)) | (1L << (OF - 134)) | (1L << (SORT - 134)) | (1L << (CLUSTER - 134)) | (1L << (DISTRIBUTE - 134)) | (1L << (OVERWRITE - 134)) | (1L << (TRANSFORM - 134)) | (1L << (REDUCE - 134)) | (1L << (SERDE - 134)) | (1L << (SERDEPROPERTIES - 134)) | (1L << (RECORDREADER - 134)) | (1L << (RECORDWRITER - 134)) | (1L << (DELIMITED - 134)) | (1L << (FIELDS - 134)) | (1L << (TERMINATED - 134)) | (1L << (COLLECTION - 134)) | (1L << (ITEMS - 134)) | (1L << (KEYS - 134)) | (1L << (ESCAPED - 134)) | (1L << (LINES - 134)) | (1L << (SEPARATED - 134)) | (1L << (FUNCTION - 134)) | (1L << (EXTENDED - 134)) | (1L << (REFRESH - 134)) | (1L << (CLEAR - 134)) | (1L << (CACHE - 134)) | (1L << (UNCACHE - 134)) | (1L << (LAZY - 134)) | (1L << (FORMATTED - 134)) | (1L << (GLOBAL - 134)) | (1L << (TEMPORARY - 134)) | (1L << (OPTIONS - 134)) | (1L << (UNSET - 134)) | (1L << (TBLPROPERTIES - 134)) | (1L << (DBPROPERTIES - 134)) | (1L << (BUCKETS - 134)) | (1L << (SKEWED - 134)) | (1L << (STORED - 134)) | (1L << (DIRECTORIES - 134)) | (1L << (LOCATION - 134)) | (1L << (EXCHANGE - 134)) | (1L << (ARCHIVE - 134)) | (1L << (UNARCHIVE - 134)) | (1L << (FILEFORMAT - 134)) | (1L << (TOUCH - 134)) | (1L << (COMPACT - 134)) | (1L << (CONCATENATE - 134)) | (1L << (CHANGE - 134)) | (1L << (CASCADE - 134)) | (1L << (RESTRICT - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (CLUSTERED - 198)) | (1L << (SORTED - 198)) | (1L << (PURGE - 198)) | (1L << (INPUTFORMAT - 198)) | (1L << (OUTPUTFORMAT - 198)) | (1L << (DATABASE - 198)) | (1L << (DATABASES - 198)) | (1L << (DFS - 198)) | (1L << (TRUNCATE - 198)) | (1L << (ANALYZE - 198)) | (1L << (COMPUTE - 198)) | (1L << (LIST - 198)) | (1L << (STATISTICS - 198)) | (1L << (PARTITIONED - 198)) | (1L << (EXTERNAL - 198)) | (1L << (DEFINED - 198)) | (1L << (REVOKE - 198)) | (1L << (GRANT - 198)) | (1L << (LOCK - 198)) | (1L << (UNLOCK - 198)) | (1L << (MSCK - 198)) | (1L << (REPAIR - 198)) | (1L << (RECOVER - 198)) | (1L << (EXPORT - 198)) | (1L << (IMPORT - 198)) | (1L << (LOAD - 198)) | (1L << (ROLE - 198)) | (1L << (ROLES - 198)) | (1L << (COMPACTIONS - 198)) | (1L << (PRINCIPALS - 198)) | (1L << (TRANSACTIONS - 198)) | (1L << (INDEX - 198)) | (1L << (INDEXES - 198)) | (1L << (LOCKS - 198)) | (1L << (OPTION - 198)) | (1L << (ANTI - 198)) | (1L << (LOCAL - 198)) | (1L << (INPATH - 198)) | (1L << (STRING - 198)) | (1L << (BIGINT_LITERAL - 198)) | (1L << (SMALLINT_LITERAL - 198)) | (1L << (TINYINT_LITERAL - 198)) | (1L << (INTEGER_VALUE - 198)) | (1L << (DECIMAL_VALUE - 198)) | (1L << (DOUBLE_LITERAL - 198)) | (1L << (BIGDECIMAL_LITERAL - 198)) | (1L << (IDENTIFIER - 198)) | (1L << (BACKQUOTED_IDENTIFIER - 198)))) != 0)) {
					{
					setState(1996);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(2001);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1997);
						match(T__2);
						setState(1998);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(2003);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2006);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2007);
				match(FIRST);
				setState(2008);
				match(T__0);
				setState(2009);
				expression();
				setState(2012);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2010);
					match(IGNORE);
					setState(2011);
					match(NULLS);
					}
				}

				setState(2014);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2016);
				match(LAST);
				setState(2017);
				match(T__0);
				setState(2018);
				expression();
				setState(2021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2019);
					match(IGNORE);
					setState(2020);
					match(NULLS);
					}
				}

				setState(2023);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2025);
				match(POSITION);
				setState(2026);
				match(T__0);
				setState(2027);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(2028);
				match(IN);
				setState(2029);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(2030);
				match(T__1);
				}
				break;
			case 8:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2032);
				constant();
				}
				break;
			case 9:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2033);
				match(ASTERISK);
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2034);
				qualifiedName();
				setState(2035);
				match(T__3);
				setState(2036);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2038);
				match(T__0);
				setState(2039);
				namedExpression();
				setState(2042); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2040);
					match(T__2);
					setState(2041);
					namedExpression();
					}
					}
					setState(2044); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(2046);
				match(T__1);
				}
				break;
			case 12:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2048);
				match(T__0);
				setState(2049);
				query();
				setState(2050);
				match(T__1);
				}
				break;
			case 13:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2052);
				qualifiedName();
				setState(2053);
				match(T__0);
				setState(2065);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (PLUS - 134)) | (1L << (MINUS - 134)) | (1L << (ASTERISK - 134)) | (1L << (DIV - 134)) | (1L << (TILDE - 134)) | (1L << (PERCENTLIT - 134)) | (1L << (BUCKET - 134)) | (1L << (OUT - 134)) | (1L << (OF - 134)) | (1L << (SORT - 134)) | (1L << (CLUSTER - 134)) | (1L << (DISTRIBUTE - 134)) | (1L << (OVERWRITE - 134)) | (1L << (TRANSFORM - 134)) | (1L << (REDUCE - 134)) | (1L << (SERDE - 134)) | (1L << (SERDEPROPERTIES - 134)) | (1L << (RECORDREADER - 134)) | (1L << (RECORDWRITER - 134)) | (1L << (DELIMITED - 134)) | (1L << (FIELDS - 134)) | (1L << (TERMINATED - 134)) | (1L << (COLLECTION - 134)) | (1L << (ITEMS - 134)) | (1L << (KEYS - 134)) | (1L << (ESCAPED - 134)) | (1L << (LINES - 134)) | (1L << (SEPARATED - 134)) | (1L << (FUNCTION - 134)) | (1L << (EXTENDED - 134)) | (1L << (REFRESH - 134)) | (1L << (CLEAR - 134)) | (1L << (CACHE - 134)) | (1L << (UNCACHE - 134)) | (1L << (LAZY - 134)) | (1L << (FORMATTED - 134)) | (1L << (GLOBAL - 134)) | (1L << (TEMPORARY - 134)) | (1L << (OPTIONS - 134)) | (1L << (UNSET - 134)) | (1L << (TBLPROPERTIES - 134)) | (1L << (DBPROPERTIES - 134)) | (1L << (BUCKETS - 134)) | (1L << (SKEWED - 134)) | (1L << (STORED - 134)) | (1L << (DIRECTORIES - 134)) | (1L << (LOCATION - 134)) | (1L << (EXCHANGE - 134)) | (1L << (ARCHIVE - 134)) | (1L << (UNARCHIVE - 134)) | (1L << (FILEFORMAT - 134)) | (1L << (TOUCH - 134)) | (1L << (COMPACT - 134)) | (1L << (CONCATENATE - 134)) | (1L << (CHANGE - 134)) | (1L << (CASCADE - 134)) | (1L << (RESTRICT - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (CLUSTERED - 198)) | (1L << (SORTED - 198)) | (1L << (PURGE - 198)) | (1L << (INPUTFORMAT - 198)) | (1L << (OUTPUTFORMAT - 198)) | (1L << (DATABASE - 198)) | (1L << (DATABASES - 198)) | (1L << (DFS - 198)) | (1L << (TRUNCATE - 198)) | (1L << (ANALYZE - 198)) | (1L << (COMPUTE - 198)) | (1L << (LIST - 198)) | (1L << (STATISTICS - 198)) | (1L << (PARTITIONED - 198)) | (1L << (EXTERNAL - 198)) | (1L << (DEFINED - 198)) | (1L << (REVOKE - 198)) | (1L << (GRANT - 198)) | (1L << (LOCK - 198)) | (1L << (UNLOCK - 198)) | (1L << (MSCK - 198)) | (1L << (REPAIR - 198)) | (1L << (RECOVER - 198)) | (1L << (EXPORT - 198)) | (1L << (IMPORT - 198)) | (1L << (LOAD - 198)) | (1L << (ROLE - 198)) | (1L << (ROLES - 198)) | (1L << (COMPACTIONS - 198)) | (1L << (PRINCIPALS - 198)) | (1L << (TRANSACTIONS - 198)) | (1L << (INDEX - 198)) | (1L << (INDEXES - 198)) | (1L << (LOCKS - 198)) | (1L << (OPTION - 198)) | (1L << (ANTI - 198)) | (1L << (LOCAL - 198)) | (1L << (INPATH - 198)) | (1L << (STRING - 198)) | (1L << (BIGINT_LITERAL - 198)) | (1L << (SMALLINT_LITERAL - 198)) | (1L << (TINYINT_LITERAL - 198)) | (1L << (INTEGER_VALUE - 198)) | (1L << (DECIMAL_VALUE - 198)) | (1L << (DOUBLE_LITERAL - 198)) | (1L << (BIGDECIMAL_LITERAL - 198)) | (1L << (IDENTIFIER - 198)) | (1L << (BACKQUOTED_IDENTIFIER - 198)))) != 0)) {
					{
					setState(2055);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
					case 1:
						{
						setState(2054);
						setQuantifier();
						}
						break;
					}
					setState(2057);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(2062);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2058);
						match(T__2);
						setState(2059);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(2064);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2067);
				match(T__1);
				setState(2070);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
				case 1:
					{
					setState(2068);
					match(OVER);
					setState(2069);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2072);
				qualifiedName();
				setState(2073);
				match(T__0);
				setState(2074);
				((FunctionCallContext)_localctx).trimOption = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (BOTH - 121)) | (1L << (LEADING - 121)) | (1L << (TRAILING - 121)))) != 0)) ) {
					((FunctionCallContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2075);
				((FunctionCallContext)_localctx).expression = expression();
				((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
				setState(2076);
				match(FROM);
				setState(2077);
				((FunctionCallContext)_localctx).expression = expression();
				((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
				setState(2078);
				match(T__1);
				}
				break;
			case 15:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2080);
				identifier();
				}
				break;
			case 16:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2081);
				match(T__0);
				setState(2082);
				expression();
				setState(2083);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2097);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2095);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2087);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2088);
						match(T__6);
						setState(2089);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2090);
						match(T__7);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2092);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2093);
						match(T__3);
						setState(2094);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(2099);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_constant);
		try {
			int _alt;
			setState(2112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2100);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2101);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2102);
				identifier();
				setState(2103);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2105);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2106);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2108); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2107);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2110); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(SqlBaseParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(SqlBaseParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2114);
			_la = _input.LA(1);
			if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (EQ - 126)) | (1L << (NSEQ - 126)) | (1L << (NEQ - 126)) | (1L << (NEQJ - 126)) | (1L << (LT - 126)) | (1L << (LTE - 126)) | (1L << (GT - 126)) | (1L << (GTE - 126)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2116);
			_la = _input.LA(1);
			if ( !(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (PLUS - 134)) | (1L << (MINUS - 134)) | (1L << (ASTERISK - 134)) | (1L << (SLASH - 134)) | (1L << (PERCENT - 134)) | (1L << (DIV - 134)) | (1L << (TILDE - 134)) | (1L << (AMPERSAND - 134)) | (1L << (PIPE - 134)) | (1L << (CONCAT_PIPE - 134)) | (1L << (HAT - 134)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2118);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2120);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_interval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2122);
			match(INTERVAL);
			setState(2126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2123);
					intervalField();
					}
					} 
				}
				setState(2128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalFieldContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IdentifierContext unit;
		public IdentifierContext to;
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_intervalField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2129);
			((IntervalFieldContext)_localctx).value = intervalValue();
			setState(2130);
			((IntervalFieldContext)_localctx).unit = identifier();
			setState(2133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				{
				setState(2131);
				match(TO);
				setState(2132);
				((IntervalFieldContext)_localctx).to = identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_intervalValue);
		int _la;
		try {
			setState(2140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2135);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2138);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2139);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColPositionContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_colPosition);
		try {
			setState(2145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2142);
				match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2143);
				match(AFTER);
				setState(2144);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_dataType);
		int _la;
		try {
			setState(2181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2147);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2148);
				match(LT);
				setState(2149);
				dataType();
				setState(2150);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2152);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2153);
				match(LT);
				setState(2154);
				dataType();
				setState(2155);
				match(T__2);
				setState(2156);
				dataType();
				setState(2157);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2159);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2166);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2160);
					match(LT);
					setState(2162);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DIV - 139)) | (1L << (PERCENTLIT - 139)) | (1L << (BUCKET - 139)) | (1L << (OUT - 139)) | (1L << (OF - 139)) | (1L << (SORT - 139)) | (1L << (CLUSTER - 139)) | (1L << (DISTRIBUTE - 139)) | (1L << (OVERWRITE - 139)) | (1L << (TRANSFORM - 139)) | (1L << (REDUCE - 139)) | (1L << (SERDE - 139)) | (1L << (SERDEPROPERTIES - 139)) | (1L << (RECORDREADER - 139)) | (1L << (RECORDWRITER - 139)) | (1L << (DELIMITED - 139)) | (1L << (FIELDS - 139)) | (1L << (TERMINATED - 139)) | (1L << (COLLECTION - 139)) | (1L << (ITEMS - 139)) | (1L << (KEYS - 139)) | (1L << (ESCAPED - 139)) | (1L << (LINES - 139)) | (1L << (SEPARATED - 139)) | (1L << (FUNCTION - 139)) | (1L << (EXTENDED - 139)) | (1L << (REFRESH - 139)) | (1L << (CLEAR - 139)) | (1L << (CACHE - 139)) | (1L << (UNCACHE - 139)) | (1L << (LAZY - 139)) | (1L << (FORMATTED - 139)) | (1L << (GLOBAL - 139)) | (1L << (TEMPORARY - 139)) | (1L << (OPTIONS - 139)) | (1L << (UNSET - 139)) | (1L << (TBLPROPERTIES - 139)) | (1L << (DBPROPERTIES - 139)) | (1L << (BUCKETS - 139)) | (1L << (SKEWED - 139)) | (1L << (STORED - 139)) | (1L << (DIRECTORIES - 139)) | (1L << (LOCATION - 139)) | (1L << (EXCHANGE - 139)) | (1L << (ARCHIVE - 139)) | (1L << (UNARCHIVE - 139)) | (1L << (FILEFORMAT - 139)) | (1L << (TOUCH - 139)) | (1L << (COMPACT - 139)) | (1L << (CONCATENATE - 139)) | (1L << (CHANGE - 139)) | (1L << (CASCADE - 139)) | (1L << (RESTRICT - 139)) | (1L << (CLUSTERED - 139)) | (1L << (SORTED - 139)) | (1L << (PURGE - 139)) | (1L << (INPUTFORMAT - 139)) | (1L << (OUTPUTFORMAT - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (DATABASE - 203)) | (1L << (DATABASES - 203)) | (1L << (DFS - 203)) | (1L << (TRUNCATE - 203)) | (1L << (ANALYZE - 203)) | (1L << (COMPUTE - 203)) | (1L << (LIST - 203)) | (1L << (STATISTICS - 203)) | (1L << (PARTITIONED - 203)) | (1L << (EXTERNAL - 203)) | (1L << (DEFINED - 203)) | (1L << (REVOKE - 203)) | (1L << (GRANT - 203)) | (1L << (LOCK - 203)) | (1L << (UNLOCK - 203)) | (1L << (MSCK - 203)) | (1L << (REPAIR - 203)) | (1L << (RECOVER - 203)) | (1L << (EXPORT - 203)) | (1L << (IMPORT - 203)) | (1L << (LOAD - 203)) | (1L << (ROLE - 203)) | (1L << (ROLES - 203)) | (1L << (COMPACTIONS - 203)) | (1L << (PRINCIPALS - 203)) | (1L << (TRANSACTIONS - 203)) | (1L << (INDEX - 203)) | (1L << (INDEXES - 203)) | (1L << (LOCKS - 203)) | (1L << (OPTION - 203)) | (1L << (ANTI - 203)) | (1L << (LOCAL - 203)) | (1L << (INPATH - 203)) | (1L << (IDENTIFIER - 203)) | (1L << (BACKQUOTED_IDENTIFIER - 203)))) != 0)) {
						{
						setState(2161);
						complexColTypeList();
						}
					}

					setState(2164);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(2165);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2168);
				identifier();
				setState(2179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(2169);
					match(T__0);
					setState(2170);
					match(INTEGER_VALUE);
					setState(2175);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2171);
						match(T__2);
						setState(2172);
						match(INTEGER_VALUE);
						}
						}
						setState(2177);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2178);
					match(T__1);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2183);
			colType();
			setState(2188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2184);
					match(T__2);
					setState(2185);
					colType();
					}
					} 
				}
				setState(2190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2191);
			identifier();
			setState(2192);
			dataType();
			setState(2195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				{
				setState(2193);
				match(COMMENT);
				setState(2194);
				match(STRING);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2197);
			complexColType();
			setState(2202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2198);
				match(T__2);
				setState(2199);
				complexColType();
				}
				}
				setState(2204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2205);
			identifier();
			setState(2206);
			match(T__8);
			setState(2207);
			dataType();
			setState(2210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2208);
				match(COMMENT);
				setState(2209);
				match(STRING);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2212);
			match(WHEN);
			setState(2213);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2214);
			match(THEN);
			setState(2215);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowsContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowsContext windows() throws RecognitionException {
		WindowsContext _localctx = new WindowsContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_windows);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2217);
			match(WINDOW);
			setState(2218);
			namedWindow();
			setState(2223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2219);
					match(T__2);
					setState(2220);
					namedWindow();
					}
					} 
				}
				setState(2225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedWindowContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2226);
			identifier();
			setState(2227);
			match(AS);
			setState(2228);
			windowSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_windowSpec);
		int _la;
		try {
			setState(2272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2230);
				((WindowRefContext)_localctx).name = identifier();
				}
				break;
			case T__0:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2231);
				match(T__0);
				setState(2266);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2232);
					match(CLUSTER);
					setState(2233);
					match(BY);
					setState(2234);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2239);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2235);
						match(T__2);
						setState(2236);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2241);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__1:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
				case DISTRIBUTE:
					{
					setState(2252);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PARTITION || _la==DISTRIBUTE) {
						{
						setState(2242);
						_la = _input.LA(1);
						if ( !(_la==PARTITION || _la==DISTRIBUTE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2243);
						match(BY);
						setState(2244);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2249);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2245);
							match(T__2);
							setState(2246);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2251);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2264);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2254);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2255);
						match(BY);
						setState(2256);
						sortItem();
						setState(2261);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2257);
							match(T__2);
							setState(2258);
							sortItem();
							}
							}
							setState(2263);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(2268);
					windowFrame();
					}
				}

				setState(2271);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_windowFrame);
		try {
			setState(2290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2274);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2275);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2276);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2277);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2278);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2279);
				match(BETWEEN);
				setState(2280);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2281);
				match(AND);
				setState(2282);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2284);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2285);
				match(BETWEEN);
				setState(2286);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2287);
				match(AND);
				setState(2288);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_frameBound);
		int _la;
		try {
			setState(2299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2292);
				match(UNBOUNDED);
				setState(2293);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2294);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(2295);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2296);
				expression();
				setState(2297);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2301);
			identifier();
			setState(2306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2302);
					match(T__3);
					setState(2303);
					identifier();
					}
					} 
				}
				setState(2308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_identifier);
		try {
			setState(2324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2309);
				strictIdentifier();
				}
				break;
			case ANTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(2310);
				match(ANTI);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2311);
				match(FULL);
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2312);
				match(INNER);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2313);
				match(LEFT);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 6);
				{
				setState(2314);
				match(SEMI);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 7);
				{
				setState(2315);
				match(RIGHT);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2316);
				match(NATURAL);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 9);
				{
				setState(2317);
				match(JOIN);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 10);
				{
				setState(2318);
				match(CROSS);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 11);
				{
				setState(2319);
				match(ON);
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 12);
				{
				setState(2320);
				match(UNION);
				}
				break;
			case INTERSECT:
				enterOuterAlt(_localctx, 13);
				{
				setState(2321);
				match(INTERSECT);
				}
				break;
			case EXCEPT:
				enterOuterAlt(_localctx, 14);
				{
				setState(2322);
				match(EXCEPT);
				}
				break;
			case SETMINUS:
				enterOuterAlt(_localctx, 15);
				{
				setState(2323);
				match(SETMINUS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_strictIdentifier);
		try {
			setState(2329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2326);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2327);
				quotedIdentifier();
				}
				break;
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2328);
				nonReserved();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2331);
			match(BACKQUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(SqlBaseParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(SqlBaseParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(SqlBaseParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SqlBaseParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(SqlBaseParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_number);
		int _la;
		try {
			setState(2361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2333);
					match(MINUS);
					}
				}

				setState(2336);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2337);
					match(MINUS);
					}
				}

				setState(2340);
				match(INTEGER_VALUE);
				}
				break;
			case 3:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2341);
					match(MINUS);
					}
				}

				setState(2344);
				match(BIGINT_LITERAL);
				}
				break;
			case 4:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2345);
					match(MINUS);
					}
				}

				setState(2348);
				match(SMALLINT_LITERAL);
				}
				break;
			case 5:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2349);
					match(MINUS);
					}
				}

				setState(2352);
				match(TINYINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2353);
					match(MINUS);
					}
				}

				setState(2356);
				match(DOUBLE_LITERAL);
				}
				break;
			case 7:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2357);
					match(MINUS);
					}
				}

				setState(2360);
				match(BIGDECIMAL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2363);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << OUTER) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DIV - 139)) | (1L << (PERCENTLIT - 139)) | (1L << (BUCKET - 139)) | (1L << (OUT - 139)) | (1L << (OF - 139)) | (1L << (SORT - 139)) | (1L << (CLUSTER - 139)) | (1L << (DISTRIBUTE - 139)) | (1L << (OVERWRITE - 139)) | (1L << (TRANSFORM - 139)) | (1L << (REDUCE - 139)) | (1L << (SERDE - 139)) | (1L << (SERDEPROPERTIES - 139)) | (1L << (RECORDREADER - 139)) | (1L << (RECORDWRITER - 139)) | (1L << (DELIMITED - 139)) | (1L << (FIELDS - 139)) | (1L << (TERMINATED - 139)) | (1L << (COLLECTION - 139)) | (1L << (ITEMS - 139)) | (1L << (KEYS - 139)) | (1L << (ESCAPED - 139)) | (1L << (LINES - 139)) | (1L << (SEPARATED - 139)) | (1L << (FUNCTION - 139)) | (1L << (EXTENDED - 139)) | (1L << (REFRESH - 139)) | (1L << (CLEAR - 139)) | (1L << (CACHE - 139)) | (1L << (UNCACHE - 139)) | (1L << (LAZY - 139)) | (1L << (FORMATTED - 139)) | (1L << (GLOBAL - 139)) | (1L << (TEMPORARY - 139)) | (1L << (OPTIONS - 139)) | (1L << (UNSET - 139)) | (1L << (TBLPROPERTIES - 139)) | (1L << (DBPROPERTIES - 139)) | (1L << (BUCKETS - 139)) | (1L << (SKEWED - 139)) | (1L << (STORED - 139)) | (1L << (DIRECTORIES - 139)) | (1L << (LOCATION - 139)) | (1L << (EXCHANGE - 139)) | (1L << (ARCHIVE - 139)) | (1L << (UNARCHIVE - 139)) | (1L << (FILEFORMAT - 139)) | (1L << (TOUCH - 139)) | (1L << (COMPACT - 139)) | (1L << (CONCATENATE - 139)) | (1L << (CHANGE - 139)) | (1L << (CASCADE - 139)) | (1L << (RESTRICT - 139)) | (1L << (CLUSTERED - 139)) | (1L << (SORTED - 139)) | (1L << (PURGE - 139)) | (1L << (INPUTFORMAT - 139)) | (1L << (OUTPUTFORMAT - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (DATABASE - 203)) | (1L << (DATABASES - 203)) | (1L << (DFS - 203)) | (1L << (TRUNCATE - 203)) | (1L << (ANALYZE - 203)) | (1L << (COMPUTE - 203)) | (1L << (LIST - 203)) | (1L << (STATISTICS - 203)) | (1L << (PARTITIONED - 203)) | (1L << (EXTERNAL - 203)) | (1L << (DEFINED - 203)) | (1L << (REVOKE - 203)) | (1L << (GRANT - 203)) | (1L << (LOCK - 203)) | (1L << (UNLOCK - 203)) | (1L << (MSCK - 203)) | (1L << (REPAIR - 203)) | (1L << (RECOVER - 203)) | (1L << (EXPORT - 203)) | (1L << (IMPORT - 203)) | (1L << (LOAD - 203)) | (1L << (ROLE - 203)) | (1L << (ROLES - 203)) | (1L << (COMPACTIONS - 203)) | (1L << (PRINCIPALS - 203)) | (1L << (TRANSACTIONS - 203)) | (1L << (INDEX - 203)) | (1L << (INDEXES - 203)) | (1L << (LOCKS - 203)) | (1L << (OPTION - 203)) | (1L << (LOCAL - 203)) | (1L << (INPATH - 203)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 35:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 68:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 71:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 72:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00fc\u0940\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e3"+
		"\n\b\3\b\3\b\3\b\5\b\u00e8\n\b\3\b\5\b\u00eb\n\b\3\b\3\b\3\b\5\b\u00f0"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00fd\n\b\3\b\3\b"+
		"\5\b\u0101\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0108\n\b\3\b\3\b\3\b\5\b\u010d"+
		"\n\b\3\b\3\b\3\b\5\b\u0112\n\b\3\b\5\b\u0115\n\b\3\b\5\b\u0118\n\b\3\b"+
		"\3\b\5\b\u011c\n\b\3\b\3\b\5\b\u0120\n\b\3\b\5\b\u0123\n\b\3\b\5\b\u0126"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u012d\n\b\3\b\3\b\5\b\u0131\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u0139\n\b\3\b\5\b\u013c\n\b\3\b\5\b\u013f\n\b\3\b\5"+
		"\b\u0142\n\b\3\b\5\b\u0145\n\b\3\b\5\b\u0148\n\b\3\b\3\b\5\b\u014c\n\b"+
		"\3\b\5\b\u014f\n\b\3\b\5\b\u0152\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0159\n\b"+
		"\3\b\3\b\3\b\3\b\5\b\u015f\n\b\3\b\3\b\3\b\3\b\5\b\u0165\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u016d\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u018d\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0195\n\b\3\b\3\b\5"+
		"\b\u0199\n\b\3\b\3\b\3\b\5\b\u019e\n\b\3\b\3\b\3\b\3\b\5\b\u01a4\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u01ac\n\b\3\b\3\b\3\b\3\b\5\b\u01b2\n\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01bf\n\b\3\b\6\b\u01c2\n"+
		"\b\r\b\16\b\u01c3\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01cd\n\b\3\b\6\b\u01d0"+
		"\n\b\r\b\16\b\u01d1\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u01e2\n\b\3\b\3\b\3\b\7\b\u01e7\n\b\f\b\16\b\u01ea\13\b\3\b"+
		"\5\b\u01ed\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01f5\n\b\3\b\3\b\3\b\7\b\u01fa"+
		"\n\b\f\b\16\b\u01fd\13\b\3\b\3\b\3\b\3\b\5\b\u0203\n\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0212\n\b\3\b\3\b\5\b\u0216\n"+
		"\b\3\b\3\b\3\b\3\b\5\b\u021c\n\b\3\b\3\b\3\b\3\b\5\b\u0222\n\b\3\b\5\b"+
		"\u0225\n\b\3\b\5\b\u0228\n\b\3\b\3\b\3\b\3\b\5\b\u022e\n\b\3\b\3\b\5\b"+
		"\u0232\n\b\3\b\3\b\5\b\u0236\n\b\3\b\3\b\3\b\5\b\u023b\n\b\3\b\3\b\5\b"+
		"\u023f\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0247\n\b\3\b\5\b\u024a\n\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0253\n\b\3\b\3\b\3\b\5\b\u0258\n\b\3\b\3"+
		"\b\3\b\3\b\5\b\u025e\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0265\n\b\3\b\5\b\u0268"+
		"\n\b\3\b\3\b\3\b\3\b\5\b\u026e\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0277"+
		"\n\b\f\b\16\b\u027a\13\b\5\b\u027c\n\b\3\b\3\b\5\b\u0280\n\b\3\b\3\b\3"+
		"\b\5\b\u0285\n\b\3\b\3\b\3\b\5\b\u028a\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0291"+
		"\n\b\3\b\5\b\u0294\n\b\3\b\5\b\u0297\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u029e"+
		"\n\b\3\b\3\b\3\b\5\b\u02a3\n\b\3\b\3\b\3\b\3\b\5\b\u02a9\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u02b2\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u02ba\n\b"+
		"\3\b\3\b\3\b\3\b\5\b\u02c0\n\b\3\b\3\b\5\b\u02c4\n\b\3\b\3\b\5\b\u02c8"+
		"\n\b\3\b\3\b\5\b\u02cc\n\b\5\b\u02ce\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u02d7\n\b\3\b\3\b\3\b\3\b\5\b\u02dd\n\b\3\b\3\b\3\b\5\b\u02e2\n\b\3"+
		"\b\5\b\u02e5\n\b\3\b\3\b\5\b\u02e9\n\b\3\b\5\b\u02ec\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\b\u02f4\n\b\f\b\16\b\u02f7\13\b\5\b\u02f9\n\b\3\b\3\b\5\b"+
		"\u02fd\n\b\3\b\3\b\3\b\5\b\u0302\n\b\3\b\5\b\u0305\n\b\3\b\3\b\3\b\3\b"+
		"\5\b\u030b\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0313\n\b\3\b\3\b\3\b\5\b\u0318"+
		"\n\b\3\b\3\b\3\b\3\b\5\b\u031e\n\b\3\b\3\b\3\b\3\b\5\b\u0324\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\7\b\u032d\n\b\f\b\16\b\u0330\13\b\3\b\3\b\3\b\7"+
		"\b\u0335\n\b\f\b\16\b\u0338\13\b\3\b\3\b\7\b\u033c\n\b\f\b\16\b\u033f"+
		"\13\b\3\b\3\b\3\b\7\b\u0344\n\b\f\b\16\b\u0347\13\b\5\b\u0349\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u0351\n\t\3\t\3\t\5\t\u0355\n\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u035c\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03d0\n\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03d8\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03e0"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03e9\n\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u03f5\n\t\3\n\3\n\5\n\u03f9\n\n\3\n\5\n\u03fc\n\n"+
		"\3\n\3\n\3\n\3\n\5\n\u0402\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u040c\n\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0418\n"+
		"\f\3\f\3\f\3\f\5\f\u041d\n\f\3\r\3\r\3\r\3\16\5\16\u0423\n\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u042f\n\17\5\17\u0431\n"+
		"\17\3\17\3\17\3\17\5\17\u0436\n\17\3\17\3\17\5\17\u043a\n\17\3\17\3\17"+
		"\3\17\5\17\u043f\n\17\3\17\3\17\3\17\5\17\u0444\n\17\3\17\5\17\u0447\n"+
		"\17\3\17\3\17\3\17\5\17\u044c\n\17\3\17\3\17\5\17\u0450\n\17\3\17\3\17"+
		"\3\17\5\17\u0455\n\17\5\17\u0457\n\17\3\20\3\20\5\20\u045b\n\20\3\21\3"+
		"\21\3\21\3\21\3\21\7\21\u0462\n\21\f\21\16\21\u0465\13\21\3\21\3\21\3"+
		"\22\3\22\3\22\5\22\u046c\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u0473\n\23"+
		"\3\24\3\24\3\24\7\24\u0478\n\24\f\24\16\24\u047b\13\24\3\25\3\25\3\25"+
		"\3\25\7\25\u0481\n\25\f\25\16\25\u0484\13\25\3\26\3\26\5\26\u0488\n\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u0495\n\30"+
		"\f\30\16\30\u0498\13\30\3\30\3\30\3\31\3\31\5\31\u049e\n\31\3\31\5\31"+
		"\u04a1\n\31\3\32\3\32\3\32\7\32\u04a6\n\32\f\32\16\32\u04a9\13\32\3\32"+
		"\5\32\u04ac\n\32\3\33\3\33\3\33\3\33\5\33\u04b2\n\33\3\34\3\34\3\34\3"+
		"\34\7\34\u04b8\n\34\f\34\16\34\u04bb\13\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\7\35\u04c3\n\35\f\35\16\35\u04c6\13\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\5\36\u04d0\n\36\3\37\3\37\3\37\3\37\3\37\5\37\u04d7\n\37"+
		"\3 \3 \3 \3 \5 \u04dd\n \3!\3!\3!\3\"\5\"\u04e3\n\"\3\"\3\"\3\"\3\"\3"+
		"\"\6\"\u04ea\n\"\r\"\16\"\u04eb\5\"\u04ee\n\"\3#\3#\3#\3#\3#\7#\u04f5"+
		"\n#\f#\16#\u04f8\13#\5#\u04fa\n#\3#\3#\3#\3#\3#\7#\u0501\n#\f#\16#\u0504"+
		"\13#\5#\u0506\n#\3#\3#\3#\3#\3#\7#\u050d\n#\f#\16#\u0510\13#\5#\u0512"+
		"\n#\3#\3#\3#\3#\3#\7#\u0519\n#\f#\16#\u051c\13#\5#\u051e\n#\3#\5#\u0521"+
		"\n#\3#\3#\3#\5#\u0526\n#\5#\u0528\n#\3$\5$\u052b\n$\3$\3$\3$\3%\3%\3%"+
		"\3%\3%\3%\5%\u0536\n%\3%\7%\u0539\n%\f%\16%\u053c\13%\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\5&\u0546\n&\3\'\3\'\5\'\u054a\n\'\3\'\3\'\5\'\u054e\n\'\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\5(\u055a\n(\3(\5(\u055d\n(\3(\3(\5(\u0561\n("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\5(\u056b\n(\3(\3(\5(\u056f\n(\5(\u0571\n(\3("+
		"\5(\u0574\n(\3(\3(\5(\u0578\n(\3(\5(\u057b\n(\3(\3(\5(\u057f\n(\3(\3("+
		"\7(\u0583\n(\f(\16(\u0586\13(\3(\5(\u0589\n(\3(\3(\5(\u058d\n(\3(\3(\3"+
		"(\5(\u0592\n(\3(\5(\u0595\n(\5(\u0597\n(\3(\7(\u059a\n(\f(\16(\u059d\13"+
		"(\3(\3(\5(\u05a1\n(\3(\5(\u05a4\n(\3(\3(\5(\u05a8\n(\3(\5(\u05ab\n(\5"+
		"(\u05ad\n(\3)\3)\3)\5)\u05b2\n)\3)\7)\u05b5\n)\f)\16)\u05b8\13)\3)\3)"+
		"\3*\3*\3*\3*\3*\3*\7*\u05c2\n*\f*\16*\u05c5\13*\3*\3*\5*\u05c9\n*\3+\3"+
		"+\3+\3+\7+\u05cf\n+\f+\16+\u05d2\13+\3+\7+\u05d5\n+\f+\16+\u05d8\13+\3"+
		",\3,\3,\3,\3,\7,\u05df\n,\f,\16,\u05e2\13,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\7,\u05ee\n,\f,\16,\u05f1\13,\3,\3,\5,\u05f5\n,\3-\3-\3-\3-\7-\u05fb"+
		"\n-\f-\16-\u05fe\13-\5-\u0600\n-\3-\3-\5-\u0604\n-\3.\3.\3.\5.\u0609\n"+
		".\3.\3.\3.\3.\3.\7.\u0610\n.\f.\16.\u0613\13.\5.\u0615\n.\3.\3.\3.\5."+
		"\u061a\n.\3.\3.\3.\7.\u061f\n.\f.\16.\u0622\13.\5.\u0624\n.\3/\3/\3\60"+
		"\3\60\7\60\u062a\n\60\f\60\16\60\u062d\13\60\3\61\3\61\3\61\3\61\5\61"+
		"\u0633\n\61\3\61\3\61\3\61\3\61\3\61\5\61\u063a\n\61\3\62\5\62\u063d\n"+
		"\62\3\62\3\62\3\62\5\62\u0642\n\62\3\62\3\62\3\62\3\62\5\62\u0648\n\62"+
		"\3\62\3\62\5\62\u064c\n\62\3\62\5\62\u064f\n\62\3\62\5\62\u0652\n\62\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u065b\n\63\f\63\16\63\u065e\13"+
		"\63\3\63\3\63\5\63\u0662\n\63\3\64\3\64\3\64\5\64\u0667\n\64\3\64\3\64"+
		"\3\65\5\65\u066c\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u067e\n\65\5\65\u0680\n\65\3\65\5"+
		"\65\u0683\n\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\7\67\u068c\n\67\f\67"+
		"\16\67\u068f\13\67\38\38\38\38\78\u0695\n8\f8\168\u0698\138\38\38\39\3"+
		"9\59\u069e\n9\3:\3:\3:\3:\7:\u06a4\n:\f:\16:\u06a7\13:\3:\3:\3;\3;\3;"+
		"\5;\u06ae\n;\3<\3<\5<\u06b2\n<\3<\3<\3<\3<\3<\3<\5<\u06ba\n<\3<\3<\3<"+
		"\3<\3<\3<\5<\u06c2\n<\3<\3<\3<\3<\5<\u06c8\n<\3=\3=\3=\3=\7=\u06ce\n="+
		"\f=\16=\u06d1\13=\3=\3=\3>\3>\3>\3>\3>\7>\u06da\n>\f>\16>\u06dd\13>\5"+
		">\u06df\n>\3>\3>\3>\3?\5?\u06e5\n?\3?\3?\5?\u06e9\n?\5?\u06eb\n?\3@\3"+
		"@\3@\3@\3@\3@\3@\5@\u06f4\n@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0700\n"+
		"@\5@\u0702\n@\3@\3@\3@\3@\3@\5@\u0709\n@\3@\3@\3@\3@\3@\5@\u0710\n@\3"+
		"@\3@\3@\3@\5@\u0716\n@\3@\3@\3@\3@\5@\u071c\n@\5@\u071e\n@\3A\3A\3A\5"+
		"A\u0723\nA\3A\3A\3B\3B\3B\5B\u072a\nB\3B\3B\3C\3C\5C\u0730\nC\3C\3C\5"+
		"C\u0734\nC\5C\u0736\nC\3D\3D\3D\7D\u073b\nD\fD\16D\u073e\13D\3E\3E\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\5F\u074b\nF\3F\3F\3F\3F\3F\3F\7F\u0753\nF\fF"+
		"\16F\u0756\13F\3G\3G\5G\u075a\nG\3H\5H\u075d\nH\3H\3H\3H\3H\3H\3H\5H\u0765"+
		"\nH\3H\3H\3H\3H\3H\7H\u076c\nH\fH\16H\u076f\13H\3H\3H\3H\5H\u0774\nH\3"+
		"H\3H\3H\3H\3H\3H\5H\u077c\nH\3H\3H\3H\3H\5H\u0782\nH\3H\3H\3H\5H\u0787"+
		"\nH\3H\3H\3H\5H\u078c\nH\3I\3I\3I\3I\5I\u0792\nI\3I\3I\3I\3I\3I\3I\3I"+
		"\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\7I\u07a7\nI\fI\16I\u07aa\13I\3J\3"+
		"J\3J\6J\u07af\nJ\rJ\16J\u07b0\3J\3J\5J\u07b5\nJ\3J\3J\3J\3J\3J\6J\u07bc"+
		"\nJ\rJ\16J\u07bd\3J\3J\5J\u07c2\nJ\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3"+
		"J\3J\3J\7J\u07d2\nJ\fJ\16J\u07d5\13J\5J\u07d7\nJ\3J\3J\3J\3J\3J\3J\5J"+
		"\u07df\nJ\3J\3J\3J\3J\3J\3J\3J\5J\u07e8\nJ\3J\3J\3J\3J\3J\3J\3J\3J\3J"+
		"\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\6J\u07fd\nJ\rJ\16J\u07fe\3J\3J\3J\3J\3"+
		"J\3J\3J\3J\3J\5J\u080a\nJ\3J\3J\3J\7J\u080f\nJ\fJ\16J\u0812\13J\5J\u0814"+
		"\nJ\3J\3J\3J\5J\u0819\nJ\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\5J\u0828"+
		"\nJ\3J\3J\3J\3J\3J\3J\3J\3J\7J\u0832\nJ\fJ\16J\u0835\13J\3K\3K\3K\3K\3"+
		"K\3K\3K\3K\6K\u083f\nK\rK\16K\u0840\5K\u0843\nK\3L\3L\3M\3M\3N\3N\3O\3"+
		"O\3P\3P\7P\u084f\nP\fP\16P\u0852\13P\3Q\3Q\3Q\3Q\5Q\u0858\nQ\3R\5R\u085b"+
		"\nR\3R\3R\5R\u085f\nR\3S\3S\3S\5S\u0864\nS\3T\3T\3T\3T\3T\3T\3T\3T\3T"+
		"\3T\3T\3T\3T\3T\3T\5T\u0875\nT\3T\3T\5T\u0879\nT\3T\3T\3T\3T\3T\7T\u0880"+
		"\nT\fT\16T\u0883\13T\3T\5T\u0886\nT\5T\u0888\nT\3U\3U\3U\7U\u088d\nU\f"+
		"U\16U\u0890\13U\3V\3V\3V\3V\5V\u0896\nV\3W\3W\3W\7W\u089b\nW\fW\16W\u089e"+
		"\13W\3X\3X\3X\3X\3X\5X\u08a5\nX\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\7Z\u08b0\n"+
		"Z\fZ\16Z\u08b3\13Z\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\7\\\u08c0\n"+
		"\\\f\\\16\\\u08c3\13\\\3\\\3\\\3\\\3\\\3\\\7\\\u08ca\n\\\f\\\16\\\u08cd"+
		"\13\\\5\\\u08cf\n\\\3\\\3\\\3\\\3\\\3\\\7\\\u08d6\n\\\f\\\16\\\u08d9\13"+
		"\\\5\\\u08db\n\\\5\\\u08dd\n\\\3\\\5\\\u08e0\n\\\3\\\5\\\u08e3\n\\\3]"+
		"\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\5]\u08f5\n]\3^\3^\3^\3^"+
		"\3^\3^\3^\5^\u08fe\n^\3_\3_\3_\7_\u0903\n_\f_\16_\u0906\13_\3`\3`\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u0917\n`\3a\3a\3a\5a\u091c\na\3"+
		"b\3b\3c\5c\u0921\nc\3c\3c\5c\u0925\nc\3c\3c\5c\u0929\nc\3c\3c\5c\u092d"+
		"\nc\3c\3c\5c\u0931\nc\3c\3c\5c\u0935\nc\3c\3c\5c\u0939\nc\3c\5c\u093c"+
		"\nc\3d\3d\3d\7\u02f5\u032e\u0336\u033d\u0345\6H\u008a\u0090\u0092e\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\2\34\3\2\u00c6\u00c7\4\2OOQQ\5\2Y[\u00ac\u00ac"+
		"\u00b2\u00b2\4\2\r\r\37\37\4\2,,VV\4\2\u00ac\u00ac\u00b2\u00b2\4\2\16"+
		"\16\u00d3\u00d3\3\2eh\3\2+,\4\2HHJJ\3\2\20\21\3\2\u00f2\u00f3\3\2$%\4"+
		"\2\u0088\u0089\u008e\u008e\3\2\u008a\u008d\4\2\u0088\u0089\u0091\u0091"+
		"\3\2{}\3\2\u0080\u0087\3\2\u0088\u0092\3\2\35 \3\2()\3\2\u0088\u0089\4"+
		"\2AA\u0099\u0099\4\2\31\31\u0097\u0097\3\2EF\n\2\f\63\66\66>di\177\u008d"+
		"\u008d\u0093\u009c\u009e\u00ea\u00ec\u00ed\2\u0aca\2\u00c8\3\2\2\2\4\u00cb"+
		"\3\2\2\2\6\u00ce\3\2\2\2\b\u00d1\3\2\2\2\n\u00d4\3\2\2\2\f\u00d7\3\2\2"+
		"\2\16\u0348\3\2\2\2\20\u03f4\3\2\2\2\22\u03f6\3\2\2\2\24\u0405\3\2\2\2"+
		"\26\u0411\3\2\2\2\30\u041e\3\2\2\2\32\u0422\3\2\2\2\34\u0456\3\2\2\2\36"+
		"\u0458\3\2\2\2 \u045c\3\2\2\2\"\u0468\3\2\2\2$\u0472\3\2\2\2&\u0474\3"+
		"\2\2\2(\u047c\3\2\2\2*\u0485\3\2\2\2,\u048d\3\2\2\2.\u0490\3\2\2\2\60"+
		"\u049b\3\2\2\2\62\u04ab\3\2\2\2\64\u04b1\3\2\2\2\66\u04b3\3\2\2\28\u04be"+
		"\3\2\2\2:\u04cf\3\2\2\2<\u04d6\3\2\2\2>\u04d8\3\2\2\2@\u04de\3\2\2\2B"+
		"\u04ed\3\2\2\2D\u04f9\3\2\2\2F\u052a\3\2\2\2H\u052f\3\2\2\2J\u0545\3\2"+
		"\2\2L\u0547\3\2\2\2N\u05ac\3\2\2\2P\u05ae\3\2\2\2R\u05c8\3\2\2\2T\u05ca"+
		"\3\2\2\2V\u05d9\3\2\2\2X\u0603\3\2\2\2Z\u0605\3\2\2\2\\\u0625\3\2\2\2"+
		"^\u0627\3\2\2\2`\u0639\3\2\2\2b\u0651\3\2\2\2d\u0661\3\2\2\2f\u0663\3"+
		"\2\2\2h\u0682\3\2\2\2j\u0684\3\2\2\2l\u0688\3\2\2\2n\u0690\3\2\2\2p\u069b"+
		"\3\2\2\2r\u069f\3\2\2\2t\u06aa\3\2\2\2v\u06c7\3\2\2\2x\u06c9\3\2\2\2z"+
		"\u06d4\3\2\2\2|\u06ea\3\2\2\2~\u071d\3\2\2\2\u0080\u0722\3\2\2\2\u0082"+
		"\u0729\3\2\2\2\u0084\u072d\3\2\2\2\u0086\u0737\3\2\2\2\u0088\u073f\3\2"+
		"\2\2\u008a\u074a\3\2\2\2\u008c\u0757\3\2\2\2\u008e\u078b\3\2\2\2\u0090"+
		"\u0791\3\2\2\2\u0092\u0827\3\2\2\2\u0094\u0842\3\2\2\2\u0096\u0844\3\2"+
		"\2\2\u0098\u0846\3\2\2\2\u009a\u0848\3\2\2\2\u009c\u084a\3\2\2\2\u009e"+
		"\u084c\3\2\2\2\u00a0\u0853\3\2\2\2\u00a2\u085e\3\2\2\2\u00a4\u0863\3\2"+
		"\2\2\u00a6\u0887\3\2\2\2\u00a8\u0889\3\2\2\2\u00aa\u0891\3\2\2\2\u00ac"+
		"\u0897\3\2\2\2\u00ae\u089f\3\2\2\2\u00b0\u08a6\3\2\2\2\u00b2\u08ab\3\2"+
		"\2\2\u00b4\u08b4\3\2\2\2\u00b6\u08e2\3\2\2\2\u00b8\u08f4\3\2\2\2\u00ba"+
		"\u08fd\3\2\2\2\u00bc\u08ff\3\2\2\2\u00be\u0916\3\2\2\2\u00c0\u091b\3\2"+
		"\2\2\u00c2\u091d\3\2\2\2\u00c4\u093b\3\2\2\2\u00c6\u093d\3\2\2\2\u00c8"+
		"\u00c9\5\16\b\2\u00c9\u00ca\7\2\2\3\u00ca\3\3\2\2\2\u00cb\u00cc\5\u0084"+
		"C\2\u00cc\u00cd\7\2\2\3\u00cd\5\3\2\2\2\u00ce\u00cf\5\u0080A\2\u00cf\u00d0"+
		"\7\2\2\3\u00d0\7\3\2\2\2\u00d1\u00d2\5\u0082B\2\u00d2\u00d3\7\2\2\3\u00d3"+
		"\t\3\2\2\2\u00d4\u00d5\5\u00a6T\2\u00d5\u00d6\7\2\2\3\u00d6\13\3\2\2\2"+
		"\u00d7\u00d8\5\u00a8U\2\u00d8\u00d9\7\2\2\3\u00d9\r\3\2\2\2\u00da\u0349"+
		"\5\32\16\2\u00db\u00dc\7a\2\2\u00dc\u0349\5\u00be`\2\u00dd\u00de\7N\2"+
		"\2\u00de\u00e2\7\u00cd\2\2\u00df\u00e0\7~\2\2\u00e0\u00e1\7 \2\2\u00e1"+
		"\u00e3\7\"\2\2\u00e2\u00df\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e7\5\u00be`\2\u00e5\u00e6\7q\2\2\u00e6\u00e8\7\u00ee\2\2"+
		"\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00eb"+
		"\5\30\r\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ef\3\2\2\2"+
		"\u00ec\u00ed\7L\2\2\u00ed\u00ee\7\u00b8\2\2\u00ee\u00f0\5.\30\2\u00ef"+
		"\u00ec\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u0349\3\2\2\2\u00f1\u00f2\7l"+
		"\2\2\u00f2\u00f3\7\u00cd\2\2\u00f3\u00f4\5\u00be`\2\u00f4\u00f5\7r\2\2"+
		"\u00f5\u00f6\7\u00b8\2\2\u00f6\u00f7\5.\30\2\u00f7\u0349\3\2\2\2\u00f8"+
		"\u00f9\7d\2\2\u00f9\u00fc\7\u00cd\2\2\u00fa\u00fb\7~\2\2\u00fb\u00fd\7"+
		"\"\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u0100\5\u00be`\2\u00ff\u0101\t\2\2\2\u0100\u00ff\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u0349\3\2\2\2\u0102\u0107\5\22\n\2\u0103\u0104\7\3\2\2"+
		"\u0104\u0105\5\u00a8U\2\u0105\u0106\7\4\2\2\u0106\u0108\3\2\2\2\u0107"+
		"\u0103\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010c\5,"+
		"\27\2\u010a\u010b\7\u00b5\2\2\u010b\u010d\5.\30\2\u010c\u010a\3\2\2\2"+
		"\u010c\u010d\3\2\2\2\u010d\u0111\3\2\2\2\u010e\u010f\7\u00d5\2\2\u010f"+
		"\u0110\7\24\2\2\u0110\u0112\5j\66\2\u0111\u010e\3\2\2\2\u0111\u0112\3"+
		"\2\2\2\u0112\u0114\3\2\2\2\u0113\u0115\5\24\13\2\u0114\u0113\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0118\5\30\r\2\u0117\u0116\3"+
		"\2\2\2\u0117\u0118\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u011a\7q\2\2\u011a"+
		"\u011c\7\u00ee\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011f"+
		"\3\2\2\2\u011d\u011e\7\u00b7\2\2\u011e\u0120\5.\30\2\u011f\u011d\3\2\2"+
		"\2\u011f\u0120\3\2\2\2\u0120\u0125\3\2\2\2\u0121\u0123\7\17\2\2\u0122"+
		"\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\5\32"+
		"\16\2\u0125\u0122\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0349\3\2\2\2\u0127"+
		"\u012c\5\22\n\2\u0128\u0129\7\3\2\2\u0129\u012a\5\u00a8U\2\u012a\u012b"+
		"\7\4\2\2\u012b\u012d\3\2\2\2\u012c\u0128\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u0130\3\2\2\2\u012e\u012f\7q\2\2\u012f\u0131\7\u00ee\2\2\u0130\u012e"+
		"\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0138\3\2\2\2\u0132\u0133\7\u00d5\2"+
		"\2\u0133\u0134\7\24\2\2\u0134\u0135\7\3\2\2\u0135\u0136\5\u00a8U\2\u0136"+
		"\u0137\7\4\2\2\u0137\u0139\3\2\2\2\u0138\u0132\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\u013b\3\2\2\2\u013a\u013c\5\24\13\2\u013b\u013a\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013f\5\26\f\2\u013e\u013d\3"+
		"\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u0142\5~@\2\u0141"+
		"\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0145\5:"+
		"\36\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146"+
		"\u0148\5\30\r\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014b\3"+
		"\2\2\2\u0149\u014a\7\u00b7\2\2\u014a\u014c\5.\30\2\u014b\u0149\3\2\2\2"+
		"\u014b\u014c\3\2\2\2\u014c\u0151\3\2\2\2\u014d\u014f\7\17\2\2\u014e\u014d"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\5\32\16\2"+
		"\u0151\u014e\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0349\3\2\2\2\u0153\u0154"+
		"\7N\2\2\u0154\u0158\7O\2\2\u0155\u0156\7~\2\2\u0156\u0157\7 \2\2\u0157"+
		"\u0159\7\"\2\2\u0158\u0155\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015a\u015b\5\u0080A\2\u015b\u015c\7$\2\2\u015c\u015e\5\u0080A\2"+
		"\u015d\u015f\5\30\r\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0349"+
		"\3\2\2\2\u0160\u0161\7\u00d1\2\2\u0161\u0162\7O\2\2\u0162\u0164\5\u0080"+
		"A\2\u0163\u0165\5 \21\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0167\7\u00d2\2\2\u0167\u016c\7\u00d4\2\2\u0168\u016d"+
		"\5\u00be`\2\u0169\u016a\7-\2\2\u016a\u016b\7_\2\2\u016b\u016d\5l\67\2"+
		"\u016c\u0168\3\2\2\2\u016c\u0169\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0349"+
		"\3\2\2\2\u016e\u016f\7l\2\2\u016f\u0170\7O\2\2\u0170\u0171\5\u0080A\2"+
		"\u0171\u0172\7\16\2\2\u0172\u0173\7_\2\2\u0173\u0174\7\3\2\2\u0174\u0175"+
		"\5\u00a8U\2\u0175\u0176\7\4\2\2\u0176\u0349\3\2\2\2\u0177\u0178\7l\2\2"+
		"\u0178\u0179\t\3\2\2\u0179\u017a\5\u0080A\2\u017a\u017b\7m\2\2\u017b\u017c"+
		"\7i\2\2\u017c\u017d\5\u0080A\2\u017d\u0349\3\2\2\2\u017e\u017f\7l\2\2"+
		"\u017f\u0180\t\3\2\2\u0180\u0181\5\u0080A\2\u0181\u0182\7r\2\2\u0182\u0183"+
		"\7\u00b7\2\2\u0183\u0184\5.\30\2\u0184\u0349\3\2\2\2\u0185\u0186\7l\2"+
		"\2\u0186\u0187\t\3\2\2\u0187\u0188\5\u0080A\2\u0188\u0189\7\u00b6\2\2"+
		"\u0189\u018c\7\u00b7\2\2\u018a\u018b\7~\2\2\u018b\u018d\7\"\2\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\5."+
		"\30\2\u018f\u0349\3\2\2\2\u0190\u0191\7l\2\2\u0191\u0192\7O\2\2\u0192"+
		"\u0194\5\u0080A\2\u0193\u0195\5 \21\2\u0194\u0193\3\2\2\2\u0194\u0195"+
		"\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198\7\u00c5\2\2\u0197\u0199\7`\2"+
		"\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b"+
		"\5\u00be`\2\u019b\u019d\5\u00aaV\2\u019c\u019e\5\u00a4S\2\u019d\u019c"+
		"\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u0349\3\2\2\2\u019f\u01a0\7l\2\2\u01a0"+
		"\u01a1\7O\2\2\u01a1\u01a3\5\u0080A\2\u01a2\u01a4\5 \21\2\u01a3\u01a2\3"+
		"\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\7r\2\2\u01a6"+
		"\u01a7\7\u009e\2\2\u01a7\u01ab\7\u00ee\2\2\u01a8\u01a9\7L\2\2\u01a9\u01aa"+
		"\7\u009f\2\2\u01aa\u01ac\5.\30\2\u01ab\u01a8\3\2\2\2\u01ab\u01ac\3\2\2"+
		"\2\u01ac\u0349\3\2\2\2\u01ad\u01ae\7l\2\2\u01ae\u01af\7O\2\2\u01af\u01b1"+
		"\5\u0080A\2\u01b0\u01b2\5 \21\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2"+
		"\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\7r\2\2\u01b4\u01b5\7\u009f\2\2\u01b5"+
		"\u01b6\5.\30\2\u01b6\u0349\3\2\2\2\u01b7\u01b8\7l\2\2\u01b8\u01b9\7O\2"+
		"\2\u01b9\u01ba\5\u0080A\2\u01ba\u01be\7\16\2\2\u01bb\u01bc\7~\2\2\u01bc"+
		"\u01bd\7 \2\2\u01bd\u01bf\7\"\2\2\u01be\u01bb\3\2\2\2\u01be\u01bf\3\2"+
		"\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01c2\5\36\20\2\u01c1\u01c0\3\2\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u0349\3\2"+
		"\2\2\u01c5\u01c6\7l\2\2\u01c6\u01c7\7Q\2\2\u01c7\u01c8\5\u0080A\2\u01c8"+
		"\u01cc\7\16\2\2\u01c9\u01ca\7~\2\2\u01ca\u01cb\7 \2\2\u01cb\u01cd\7\""+
		"\2\2\u01cc\u01c9\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce"+
		"\u01d0\5 \21\2\u01cf\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01cf\3\2"+
		"\2\2\u01d1\u01d2\3\2\2\2\u01d2\u0349\3\2\2\2\u01d3\u01d4\7l\2\2\u01d4"+
		"\u01d5\7O\2\2\u01d5\u01d6\5\u0080A\2\u01d6\u01d7\5 \21\2\u01d7\u01d8\7"+
		"m\2\2\u01d8\u01d9\7i\2\2\u01d9\u01da\5 \21\2\u01da\u0349\3\2\2\2\u01db"+
		"\u01dc\7l\2\2\u01dc\u01dd\7O\2\2\u01dd\u01de\5\u0080A\2\u01de\u01e1\7"+
		"d\2\2\u01df\u01e0\7~\2\2\u01e0\u01e2\7\"\2\2\u01e1\u01df\3\2\2\2\u01e1"+
		"\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e8\5 \21\2\u01e4\u01e5\7\5"+
		"\2\2\u01e5\u01e7\5 \21\2\u01e6\u01e4\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8"+
		"\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2"+
		"\2\2\u01eb\u01ed\7\u00ca\2\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u0349\3\2\2\2\u01ee\u01ef\7l\2\2\u01ef\u01f0\7Q\2\2\u01f0\u01f1\5\u0080"+
		"A\2\u01f1\u01f4\7d\2\2\u01f2\u01f3\7~\2\2\u01f3\u01f5\7\"\2\2\u01f4\u01f2"+
		"\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01fb\5 \21\2\u01f7"+
		"\u01f8\7\5\2\2\u01f8\u01fa\5 \21\2\u01f9\u01f7\3\2\2\2\u01fa\u01fd\3\2"+
		"\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0349\3\2\2\2\u01fd"+
		"\u01fb\3\2\2\2\u01fe\u01ff\7l\2\2\u01ff\u0200\7O\2\2\u0200\u0202\5\u0080"+
		"A\2\u0201\u0203\5 \21\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0205\7r\2\2\u0205\u0206\5\30\r\2\u0206\u0349\3\2"+
		"\2\2\u0207\u0208\7l\2\2\u0208\u0209\7O\2\2\u0209\u020a\5\u0080A\2\u020a"+
		"\u020b\7\u00de\2\2\u020b\u020c\7b\2\2\u020c\u0349\3\2\2\2\u020d\u020e"+
		"\7d\2\2\u020e\u0211\7O\2\2\u020f\u0210\7~\2\2\u0210\u0212\7\"\2\2\u0211"+
		"\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215\5\u0080"+
		"A\2\u0214\u0216\7\u00ca\2\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216"+
		"\u0349\3\2\2\2\u0217\u0218\7d\2\2\u0218\u021b\7Q\2\2\u0219\u021a\7~\2"+
		"\2\u021a\u021c\7\"\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d"+
		"\3\2\2\2\u021d\u0349\5\u0080A\2\u021e\u0221\7N\2\2\u021f\u0220\7\35\2"+
		"\2\u0220\u0222\7R\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0227"+
		"\3\2\2\2\u0223\u0225\7\u00b3\2\2\u0224\u0223\3\2\2\2\u0224\u0225\3\2\2"+
		"\2\u0225\u0226\3\2\2\2\u0226\u0228\7\u00b4\2\2\u0227\u0224\3\2\2\2\u0227"+
		"\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022d\7Q\2\2\u022a\u022b\7~\2"+
		"\2\u022b\u022c\7 \2\2\u022c\u022e\7\"\2\2\u022d\u022a\3\2\2\2\u022d\u022e"+
		"\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\5\u0080A\2\u0230\u0232\5r:\2"+
		"\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0234"+
		"\7q\2\2\u0234\u0236\7\u00ee\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2"+
		"\2\u0236\u023a\3\2\2\2\u0237\u0238\7\u00d5\2\2\u0238\u0239\7=\2\2\u0239"+
		"\u023b\5j\66\2\u023a\u0237\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023e\3\2"+
		"\2\2\u023c\u023d\7\u00b7\2\2\u023d\u023f\5.\30\2\u023e\u023c\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\7\17\2\2\u0241\u0242\5"+
		"\32\16\2\u0242\u0349\3\2\2\2\u0243\u0246\7N\2\2\u0244\u0245\7\35\2\2\u0245"+
		"\u0247\7R\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0249\3\2"+
		"\2\2\u0248\u024a\7\u00b3\2\2\u0249\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"\u024b\3\2\2\2\u024b\u024c\7\u00b4\2\2\u024c\u024d\7Q\2\2\u024d\u0252"+
		"\5\u0080A\2\u024e\u024f\7\3\2\2\u024f\u0250\5\u00a8U\2\u0250\u0251\7\4"+
		"\2\2\u0251\u0253\3\2\2\2\u0252\u024e\3\2\2\2\u0252\u0253\3\2\2\2\u0253"+
		"\u0254\3\2\2\2\u0254\u0257\5,\27\2\u0255\u0256\7\u00b5\2\2\u0256\u0258"+
		"\5.\30\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0349\3\2\2\2\u0259"+
		"\u025a\7l\2\2\u025a\u025b\7Q\2\2\u025b\u025d\5\u0080A\2\u025c\u025e\7"+
		"\17\2\2\u025d\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\3\2\2\2\u025f"+
		"\u0260\5\32\16\2\u0260\u0349\3\2\2\2\u0261\u0264\7N\2\2\u0262\u0263\7"+
		"\35\2\2\u0263\u0265\7R\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265"+
		"\u0267\3\2\2\2\u0266\u0268\7\u00b4\2\2\u0267\u0266\3\2\2\2\u0267\u0268"+
		"\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026d\7\u00ab\2\2\u026a\u026b\7~\2"+
		"\2\u026b\u026c\7 \2\2\u026c\u026e\7\"\2\2\u026d\u026a\3\2\2\2\u026d\u026e"+
		"\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\5\u00bc_\2\u0270\u0271\7\17\2"+
		"\2\u0271\u027b\7\u00ee\2\2\u0272\u0273\7\u009d\2\2\u0273\u0278\5@!\2\u0274"+
		"\u0275\7\5\2\2\u0275\u0277\5@!\2\u0276\u0274\3\2\2\2\u0277\u027a\3\2\2"+
		"\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027c\3\2\2\2\u027a\u0278"+
		"\3\2\2\2\u027b\u0272\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u0349\3\2\2\2\u027d"+
		"\u027f\7d\2\2\u027e\u0280\7\u00b4\2\2\u027f\u027e\3\2\2\2\u027f\u0280"+
		"\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0284\7\u00ab\2\2\u0282\u0283\7~\2"+
		"\2\u0283\u0285\7\"\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286"+
		"\3\2\2\2\u0286\u0349\5\u00bc_\2\u0287\u0289\7W\2\2\u0288\u028a\t\4\2\2"+
		"\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u0349"+
		"\5\16\b\2\u028c\u028d\7]\2\2\u028d\u0290\7^\2\2\u028e\u028f\t\5\2\2\u028f"+
		"\u0291\5\u00be`\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0296"+
		"\3\2\2\2\u0292\u0294\7$\2\2\u0293\u0292\3\2\2\2\u0293\u0294\3\2\2\2\u0294"+
		"\u0295\3\2\2\2\u0295\u0297\7\u00ee\2\2\u0296\u0293\3\2\2\2\u0296\u0297"+
		"\3\2\2\2\u0297\u0349\3\2\2\2\u0298\u0299\7]\2\2\u0299\u029a\7O\2\2\u029a"+
		"\u029d\7\u00ac\2\2\u029b\u029c\t\5\2\2\u029c\u029e\5\u00be`\2\u029d\u029b"+
		"\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\7$\2\2\u02a0"+
		"\u02a2\7\u00ee\2\2\u02a1\u02a3\5 \21\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3"+
		"\3\2\2\2\u02a3\u0349\3\2\2\2\u02a4\u02a5\7]\2\2\u02a5\u02a8\7\u00ce\2"+
		"\2\u02a6\u02a7\7$\2\2\u02a7\u02a9\7\u00ee\2\2\u02a8\u02a6\3\2\2\2\u02a8"+
		"\u02a9\3\2\2\2\u02a9\u0349\3\2\2\2\u02aa\u02ab\7]\2\2\u02ab\u02ac\7\u00b7"+
		"\2\2\u02ac\u02b1\5\u0080A\2\u02ad\u02ae\7\3\2\2\u02ae\u02af\5\62\32\2"+
		"\u02af\u02b0\7\4\2\2\u02b0\u02b2\3\2\2\2\u02b1\u02ad\3\2\2\2\u02b1\u02b2"+
		"\3\2\2\2\u02b2\u0349\3\2\2\2\u02b3\u02b4\7]\2\2\u02b4\u02b5\7_\2\2\u02b5"+
		"\u02b6\t\5\2\2\u02b6\u02b9\5\u0080A\2\u02b7\u02b8\t\5\2\2\u02b8\u02ba"+
		"\5\u00be`\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u0349\3\2\2"+
		"\2\u02bb\u02bc\7]\2\2\u02bc\u02bd\7b\2\2\u02bd\u02bf\5\u0080A\2\u02be"+
		"\u02c0\5 \21\2\u02bf\u02be\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u0349\3\2"+
		"\2\2\u02c1\u02c3\7]\2\2\u02c2\u02c4\5\u00be`\2\u02c3\u02c2\3\2\2\2\u02c3"+
		"\u02c4\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02cd\7c\2\2\u02c6\u02c8\7$\2"+
		"\2\u02c7\u02c6\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9\u02cc"+
		"\5\u00bc_\2\u02ca\u02cc\7\u00ee\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02ca\3"+
		"\2\2\2\u02cc\u02ce\3\2\2\2\u02cd\u02c7\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce"+
		"\u0349\3\2\2\2\u02cf\u02d0\7]\2\2\u02d0\u02d1\7N\2\2\u02d1\u02d2\7O\2"+
		"\2\u02d2\u0349\5\u0080A\2\u02d3\u02d4\t\6\2\2\u02d4\u02d6\7\u00ab\2\2"+
		"\u02d5\u02d7\7\u00ac\2\2\u02d6\u02d5\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7"+
		"\u02d8\3\2\2\2\u02d8\u0349\5$\23\2\u02d9\u02da\t\6\2\2\u02da\u02dc\7\u00cd"+
		"\2\2\u02db\u02dd\7\u00ac\2\2\u02dc\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd"+
		"\u02de\3\2\2\2\u02de\u0349\5\u00be`\2\u02df\u02e1\t\6\2\2\u02e0\u02e2"+
		"\7O\2\2\u02e1\u02e0\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e4\3\2\2\2\u02e3"+
		"\u02e5\t\7\2\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\3\2"+
		"\2\2\u02e6\u02e8\5\u0080A\2\u02e7\u02e9\5 \21\2\u02e8\u02e7\3\2\2\2\u02e8"+
		"\u02e9\3\2\2\2\u02e9\u02eb\3\2\2\2\u02ea\u02ec\5&\24\2\u02eb\u02ea\3\2"+
		"\2\2\u02eb\u02ec\3\2\2\2\u02ec\u0349\3\2\2\2\u02ed\u02ee\7\u00ad\2\2\u02ee"+
		"\u02ef\7O\2\2\u02ef\u0349\5\u0080A\2\u02f0\u02f8\7\u00ad\2\2\u02f1\u02f9"+
		"\7\u00ee\2\2\u02f2\u02f4\13\2\2\2\u02f3\u02f2\3\2\2\2\u02f4\u02f7\3\2"+
		"\2\2\u02f5\u02f6\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7"+
		"\u02f5\3\2\2\2\u02f8\u02f1\3\2\2\2\u02f8\u02f5\3\2\2\2\u02f9\u0349\3\2"+
		"\2\2\u02fa\u02fc\7\u00af\2\2\u02fb\u02fd\7\u00b1\2\2\u02fc\u02fb\3\2\2"+
		"\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\7O\2\2\u02ff\u0304"+
		"\5\u0080A\2\u0300\u0302\7\17\2\2\u0301\u0300\3\2\2\2\u0301\u0302\3\2\2"+
		"\2\u0302\u0303\3\2\2\2\u0303\u0305\5\32\16\2\u0304\u0301\3\2\2\2\u0304"+
		"\u0305\3\2\2\2\u0305\u0349\3\2\2\2\u0306\u0307\7\u00b0\2\2\u0307\u030a"+
		"\7O\2\2\u0308\u0309\7~\2\2\u0309\u030b\7\"\2\2\u030a\u0308\3\2\2\2\u030a"+
		"\u030b\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u0349\5\u0080A\2\u030d\u030e"+
		"\7\u00ae\2\2\u030e\u0349\7\u00af\2\2\u030f\u0310\7\u00e1\2\2\u0310\u0312"+
		"\7t\2\2\u0311\u0313\7\u00ec\2\2\u0312\u0311\3\2\2\2\u0312\u0313\3\2\2"+
		"\2\u0313\u0314\3\2\2\2\u0314\u0315\7\u00ed\2\2\u0315\u0317\7\u00ee\2\2"+
		"\u0316\u0318\7\u009a\2\2\u0317\u0316\3\2\2\2\u0317\u0318\3\2\2\2\u0318"+
		"\u0319\3\2\2\2\u0319\u031a\7U\2\2\u031a\u031b\7O\2\2\u031b\u031d\5\u0080"+
		"A\2\u031c\u031e\5 \21\2\u031d\u031c\3\2\2\2\u031d\u031e\3\2\2\2\u031e"+
		"\u0349\3\2\2\2\u031f\u0320\7\u00d0\2\2\u0320\u0321\7O\2\2\u0321\u0323"+
		"\5\u0080A\2\u0322\u0324\5 \21\2\u0323\u0322\3\2\2\2\u0323\u0324\3\2\2"+
		"\2\u0324\u0349\3\2\2\2\u0325\u0326\7\u00dc\2\2\u0326\u0327\7\u00dd\2\2"+
		"\u0327\u0328\7O\2\2\u0328\u0349\5\u0080A\2\u0329\u032a\t\b\2\2\u032a\u032e"+
		"\5\u00be`\2\u032b\u032d\13\2\2\2\u032c\u032b\3\2\2\2\u032d\u0330\3\2\2"+
		"\2\u032e\u032f\3\2\2\2\u032e\u032c\3\2\2\2\u032f\u0349\3\2\2\2\u0330\u032e"+
		"\3\2\2\2\u0331\u0332\7r\2\2\u0332\u0336\7\u00e2\2\2\u0333\u0335\13\2\2"+
		"\2\u0334\u0333\3\2\2\2\u0335\u0338\3\2\2\2\u0336\u0337\3\2\2\2\u0336\u0334"+
		"\3\2\2\2\u0337\u0349\3\2\2\2\u0338\u0336\3\2\2\2\u0339\u033d\7r\2\2\u033a"+
		"\u033c\13\2\2\2\u033b\u033a\3\2\2\2\u033c\u033f\3\2\2\2\u033d\u033e\3"+
		"\2\2\2\u033d\u033b\3\2\2\2\u033e\u0349\3\2\2\2\u033f\u033d\3\2\2\2\u0340"+
		"\u0349\7s\2\2\u0341\u0345\5\20\t\2\u0342\u0344\13\2\2\2\u0343\u0342\3"+
		"\2\2\2\u0344\u0347\3\2\2\2\u0345\u0346\3\2\2\2\u0345\u0343\3\2\2\2\u0346"+
		"\u0349\3\2\2\2\u0347\u0345\3\2\2\2\u0348\u00da\3\2\2\2\u0348\u00db\3\2"+
		"\2\2\u0348\u00dd\3\2\2\2\u0348\u00f1\3\2\2\2\u0348\u00f8\3\2\2\2\u0348"+
		"\u0102\3\2\2\2\u0348\u0127\3\2\2\2\u0348\u0153\3\2\2\2\u0348\u0160\3\2"+
		"\2\2\u0348\u016e\3\2\2\2\u0348\u0177\3\2\2\2\u0348\u017e\3\2\2\2\u0348"+
		"\u0185\3\2\2\2\u0348\u0190\3\2\2\2\u0348\u019f\3\2\2\2\u0348\u01ad\3\2"+
		"\2\2\u0348\u01b7\3\2\2\2\u0348\u01c5\3\2\2\2\u0348\u01d3\3\2\2\2\u0348"+
		"\u01db\3\2\2\2\u0348\u01ee\3\2\2\2\u0348\u01fe\3\2\2\2\u0348\u0207\3\2"+
		"\2\2\u0348\u020d\3\2\2\2\u0348\u0217\3\2\2\2\u0348\u021e\3\2\2\2\u0348"+
		"\u0243\3\2\2\2\u0348\u0259\3\2\2\2\u0348\u0261\3\2\2\2\u0348\u027d\3\2"+
		"\2\2\u0348\u0287\3\2\2\2\u0348\u028c\3\2\2\2\u0348\u0298\3\2\2\2\u0348"+
		"\u02a4\3\2\2\2\u0348\u02aa\3\2\2\2\u0348\u02b3\3\2\2\2\u0348\u02bb\3\2"+
		"\2\2\u0348\u02c1\3\2\2\2\u0348\u02cf\3\2\2\2\u0348\u02d3\3\2\2\2\u0348"+
		"\u02d9\3\2\2\2\u0348\u02df\3\2\2\2\u0348\u02ed\3\2\2\2\u0348\u02f0\3\2"+
		"\2\2\u0348\u02fa\3\2\2\2\u0348\u0306\3\2\2\2\u0348\u030d\3\2\2\2\u0348"+
		"\u030f\3\2\2\2\u0348\u031f\3\2\2\2\u0348\u0325\3\2\2\2\u0348\u0329\3\2"+
		"\2\2\u0348\u0331\3\2\2\2\u0348\u0339\3\2\2\2\u0348\u0340\3\2\2\2\u0348"+
		"\u0341\3\2\2\2\u0349\17\3\2\2\2\u034a\u034b\7N\2\2\u034b\u03f5\7\u00e2"+
		"\2\2\u034c\u034d\7d\2\2\u034d\u03f5\7\u00e2\2\2\u034e\u0350\7\u00d9\2"+
		"\2\u034f\u0351\7\u00e2\2\2\u0350\u034f\3\2\2\2\u0350\u0351\3\2\2\2\u0351"+
		"\u03f5\3\2\2\2\u0352\u0354\7\u00d8\2\2\u0353\u0355\7\u00e2\2\2\u0354\u0353"+
		"\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u03f5\3\2\2\2\u0356\u0357\7]\2\2\u0357"+
		"\u03f5\7\u00d9\2\2\u0358\u0359\7]\2\2\u0359\u035b\7\u00e2\2\2\u035a\u035c"+
		"\7\u00d9\2\2\u035b\u035a\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u03f5\3\2\2"+
		"\2\u035d\u035e\7]\2\2\u035e\u03f5\7\u00e5\2\2\u035f\u0360\7]\2\2\u0360"+
		"\u03f5\7\u00e3\2\2\u0361\u0362\7]\2\2\u0362\u0363\7G\2\2\u0363\u03f5\7"+
		"\u00e3\2\2\u0364\u0365\7\u00df\2\2\u0365\u03f5\7O\2\2\u0366\u0367\7\u00e0"+
		"\2\2\u0367\u03f5\7O\2\2\u0368\u0369\7]\2\2\u0369\u03f5\7\u00e4\2\2\u036a"+
		"\u036b\7]\2\2\u036b\u036c\7N\2\2\u036c\u03f5\7O\2\2\u036d\u036e\7]\2\2"+
		"\u036e\u03f5\7\u00e6\2\2\u036f\u0370\7]\2\2\u0370\u03f5\7\u00e8\2\2\u0371"+
		"\u0372\7]\2\2\u0372\u03f5\7\u00e9\2\2\u0373\u0374\7N\2\2\u0374\u03f5\7"+
		"\u00e7\2\2\u0375\u0376\7d\2\2\u0376\u03f5\7\u00e7\2\2\u0377\u0378\7l\2"+
		"\2\u0378\u03f5\7\u00e7\2\2\u0379\u037a\7\u00da\2\2\u037a\u03f5\7O\2\2"+
		"\u037b\u037c\7\u00da\2\2\u037c\u03f5\7\u00cd\2\2\u037d\u037e\7\u00db\2"+
		"\2\u037e\u03f5\7O\2\2\u037f\u0380\7\u00db\2\2\u0380\u03f5\7\u00cd\2\2"+
		"\u0381\u0382\7N\2\2\u0382\u0383\7\u00b4\2\2\u0383\u03f5\7y\2\2\u0384\u0385"+
		"\7d\2\2\u0385\u0386\7\u00b4\2\2\u0386\u03f5\7y\2\2\u0387\u0388\7l\2\2"+
		"\u0388\u0389\7O\2\2\u0389\u038a\5\u0080A\2\u038a\u038b\7 \2\2\u038b\u038c"+
		"\7\u00c8\2\2\u038c\u03f5\3\2\2\2\u038d\u038e\7l\2\2\u038e\u038f\7O\2\2"+
		"\u038f\u0390\5\u0080A\2\u0390\u0391\7\u00c8\2\2\u0391\u0392\7\24\2\2\u0392"+
		"\u03f5\3\2\2\2\u0393\u0394\7l\2\2\u0394\u0395\7O\2\2\u0395\u0396\5\u0080"+
		"A\2\u0396\u0397\7 \2\2\u0397\u0398\7\u00c9\2\2\u0398\u03f5\3\2\2\2\u0399"+
		"\u039a\7l\2\2\u039a\u039b\7O\2\2\u039b\u039c\5\u0080A\2\u039c\u039d\7"+
		"\u00ba\2\2\u039d\u039e\7\24\2\2\u039e\u03f5\3\2\2\2\u039f\u03a0\7l\2\2"+
		"\u03a0\u03a1\7O\2\2\u03a1\u03a2\5\u0080A\2\u03a2\u03a3\7 \2\2\u03a3\u03a4"+
		"\7\u00ba\2\2\u03a4\u03f5\3\2\2\2\u03a5\u03a6\7l\2\2\u03a6\u03a7\7O\2\2"+
		"\u03a7\u03a8\5\u0080A\2\u03a8\u03a9\7 \2\2\u03a9\u03aa\7\u00bb\2\2\u03aa"+
		"\u03ab\7\17\2\2\u03ab\u03ac\7\u00bc\2\2\u03ac\u03f5\3\2\2\2\u03ad\u03ae"+
		"\7l\2\2\u03ae\u03af\7O\2\2\u03af\u03b0\5\u0080A\2\u03b0\u03b1\7r\2\2\u03b1"+
		"\u03b2\7\u00ba\2\2\u03b2\u03b3\7\u00bd\2\2\u03b3\u03f5\3\2\2\2\u03b4\u03b5"+
		"\7l\2\2\u03b5\u03b6\7O\2\2\u03b6\u03b7\5\u0080A\2\u03b7\u03b8\7\u00be"+
		"\2\2\u03b8\u03b9\7A\2\2\u03b9\u03f5\3\2\2\2\u03ba\u03bb\7l\2\2\u03bb\u03bc"+
		"\7O\2\2\u03bc\u03bd\5\u0080A\2\u03bd\u03be\7\u00bf\2\2\u03be\u03bf\7A"+
		"\2\2\u03bf\u03f5\3\2\2\2\u03c0\u03c1\7l\2\2\u03c1\u03c2\7O\2\2\u03c2\u03c3"+
		"\5\u0080A\2\u03c3\u03c4\7\u00c0\2\2\u03c4\u03c5\7A\2\2\u03c5\u03f5\3\2"+
		"\2\2\u03c6\u03c7\7l\2\2\u03c7\u03c8\7O\2\2\u03c8\u03c9\5\u0080A\2\u03c9"+
		"\u03ca\7\u00c2\2\2\u03ca\u03f5\3\2\2\2\u03cb\u03cc\7l\2\2\u03cc\u03cd"+
		"\7O\2\2\u03cd\u03cf\5\u0080A\2\u03ce\u03d0\5 \21\2\u03cf\u03ce\3\2\2\2"+
		"\u03cf\u03d0\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d2\7\u00c3\2\2\u03d2"+
		"\u03f5\3\2\2\2\u03d3\u03d4\7l\2\2\u03d4\u03d5\7O\2\2\u03d5\u03d7\5\u0080"+
		"A\2\u03d6\u03d8\5 \21\2\u03d7\u03d6\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8"+
		"\u03d9\3\2\2\2\u03d9\u03da\7\u00c4\2\2\u03da\u03f5\3\2\2\2\u03db\u03dc"+
		"\7l\2\2\u03dc\u03dd\7O\2\2\u03dd\u03df\5\u0080A\2\u03de\u03e0\5 \21\2"+
		"\u03df\u03de\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e2"+
		"\7r\2\2\u03e2\u03e3\7\u00c1\2\2\u03e3\u03f5\3\2\2\2\u03e4\u03e5\7l\2\2"+
		"\u03e5\u03e6\7O\2\2\u03e6\u03e8\5\u0080A\2\u03e7\u03e9\5 \21\2\u03e8\u03e7"+
		"\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb\7R\2\2\u03eb"+
		"\u03ec\7_\2\2\u03ec\u03f5\3\2\2\2\u03ed\u03ee\7u\2\2\u03ee\u03f5\7v\2"+
		"\2\u03ef\u03f5\7w\2\2\u03f0\u03f5\7x\2\2\u03f1\u03f5\7\u00cf\2\2\u03f2"+
		"\u03f3\7T\2\2\u03f3\u03f5\7\r\2\2\u03f4\u034a\3\2\2\2\u03f4\u034c\3\2"+
		"\2\2\u03f4\u034e\3\2\2\2\u03f4\u0352\3\2\2\2\u03f4\u0356\3\2\2\2\u03f4"+
		"\u0358\3\2\2\2\u03f4\u035d\3\2\2\2\u03f4\u035f\3\2\2\2\u03f4\u0361\3\2"+
		"\2\2\u03f4\u0364\3\2\2\2\u03f4\u0366\3\2\2\2\u03f4\u0368\3\2\2\2\u03f4"+
		"\u036a\3\2\2\2\u03f4\u036d\3\2\2\2\u03f4\u036f\3\2\2\2\u03f4\u0371\3\2"+
		"\2\2\u03f4\u0373\3\2\2\2\u03f4\u0375\3\2\2\2\u03f4\u0377\3\2\2\2\u03f4"+
		"\u0379\3\2\2\2\u03f4\u037b\3\2\2\2\u03f4\u037d\3\2\2\2\u03f4\u037f\3\2"+
		"\2\2\u03f4\u0381\3\2\2\2\u03f4\u0384\3\2\2\2\u03f4\u0387\3\2\2\2\u03f4"+
		"\u038d\3\2\2\2\u03f4\u0393\3\2\2\2\u03f4\u0399\3\2\2\2\u03f4\u039f\3\2"+
		"\2\2\u03f4\u03a5\3\2\2\2\u03f4\u03ad\3\2\2\2\u03f4\u03b4\3\2\2\2\u03f4"+
		"\u03ba\3\2\2\2\u03f4\u03c0\3\2\2\2\u03f4\u03c6\3\2\2\2\u03f4\u03cb\3\2"+
		"\2\2\u03f4\u03d3\3\2\2\2\u03f4\u03db\3\2\2\2\u03f4\u03e4\3\2\2\2\u03f4"+
		"\u03ed\3\2\2\2\u03f4\u03ef\3\2\2\2\u03f4\u03f0\3\2\2\2\u03f4\u03f1\3\2"+
		"\2\2\u03f4\u03f2\3\2\2\2\u03f5\21\3\2\2\2\u03f6\u03f8\7N\2\2\u03f7\u03f9"+
		"\7\u00b4\2\2\u03f8\u03f7\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fb\3\2\2"+
		"\2\u03fa\u03fc\7\u00d6\2\2\u03fb\u03fa\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc"+
		"\u03fd\3\2\2\2\u03fd\u0401\7O\2\2\u03fe\u03ff\7~\2\2\u03ff\u0400\7 \2"+
		"\2\u0400\u0402\7\"\2\2\u0401\u03fe\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0403"+
		"\3\2\2\2\u0403\u0404\5\u0080A\2\u0404\23\3\2\2\2\u0405\u0406\7\u00c8\2"+
		"\2\u0406\u0407\7\24\2\2\u0407\u040b\5j\66\2\u0408\u0409\7\u00c9\2\2\u0409"+
		"\u040a\7\24\2\2\u040a\u040c\5n8\2\u040b\u0408\3\2\2\2\u040b\u040c\3\2"+
		"\2\2\u040c\u040d\3\2\2\2\u040d\u040e\7U\2\2\u040e\u040f\7\u00f2\2\2\u040f"+
		"\u0410\7\u00b9\2\2\u0410\25\3\2\2\2\u0411\u0412\7\u00ba\2\2\u0412\u0413"+
		"\7\24\2\2\u0413\u0414\5j\66\2\u0414\u0417\7=\2\2\u0415\u0418\5\66\34\2"+
		"\u0416\u0418\58\35\2\u0417\u0415\3\2\2\2\u0417\u0416\3\2\2\2\u0418\u041c"+
		"\3\2\2\2\u0419\u041a\7\u00bb\2\2\u041a\u041b\7\17\2\2\u041b\u041d\7\u00bc"+
		"\2\2\u041c\u0419\3\2\2\2\u041c\u041d\3\2\2\2\u041d\27\3\2\2\2\u041e\u041f"+
		"\7\u00bd\2\2\u041f\u0420\7\u00ee\2\2\u0420\31\3\2\2\2\u0421\u0423\5(\25"+
		"\2\u0422\u0421\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0425"+
		"\5B\"\2\u0425\33\3\2\2\2\u0426\u0427\7S\2\2\u0427\u0428\7\u009a\2\2\u0428"+
		"\u0429\7O\2\2\u0429\u0430\5\u0080A\2\u042a\u042e\5 \21\2\u042b\u042c\7"+
		"~\2\2\u042c\u042d\7 \2\2\u042d\u042f\7\"\2\2\u042e\u042b\3\2\2\2\u042e"+
		"\u042f\3\2\2\2\u042f\u0431\3\2\2\2\u0430\u042a\3\2\2\2\u0430\u0431\3\2"+
		"\2\2\u0431\u0457\3\2\2\2\u0432\u0433\7S\2\2\u0433\u0435\7U\2\2\u0434\u0436"+
		"\7O\2\2\u0435\u0434\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0437\3\2\2\2\u0437"+
		"\u0439\5\u0080A\2\u0438\u043a\5 \21\2\u0439\u0438\3\2\2\2\u0439\u043a"+
		"\3\2\2\2\u043a\u0457\3\2\2\2\u043b\u043c\7S\2\2\u043c\u043e\7\u009a\2"+
		"\2\u043d\u043f\7\u00ec\2\2\u043e\u043d\3\2\2\2\u043e\u043f\3\2\2\2\u043f"+
		"\u0440\3\2\2\2\u0440\u0441\7P\2\2\u0441\u0443\7\u00ee\2\2\u0442\u0444"+
		"\5~@\2\u0443\u0442\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0446\3\2\2\2\u0445"+
		"\u0447\5:\36\2\u0446\u0445\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0457\3\2"+
		"\2\2\u0448\u0449\7S\2\2\u0449\u044b\7\u009a\2\2\u044a\u044c\7\u00ec\2"+
		"\2\u044b\u044a\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u044f"+
		"\7P\2\2\u044e\u0450\7\u00ee\2\2\u044f\u044e\3\2\2\2\u044f\u0450\3\2\2"+
		"\2\u0450\u0451\3\2\2\2\u0451\u0454\5,\27\2\u0452\u0453\7\u00b5\2\2\u0453"+
		"\u0455\5.\30\2\u0454\u0452\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0457\3\2"+
		"\2\2\u0456\u0426\3\2\2\2\u0456\u0432\3\2\2\2\u0456\u043b\3\2\2\2\u0456"+
		"\u0448\3\2\2\2\u0457\35\3\2\2\2\u0458\u045a\5 \21\2\u0459\u045b\5\30\r"+
		"\2\u045a\u0459\3\2\2\2\u045a\u045b\3\2\2\2\u045b\37\3\2\2\2\u045c\u045d"+
		"\7A\2\2\u045d\u045e\7\3\2\2\u045e\u0463\5\"\22\2\u045f\u0460\7\5\2\2\u0460"+
		"\u0462\5\"\22\2\u0461\u045f\3\2\2\2\u0462\u0465\3\2\2\2\u0463\u0461\3"+
		"\2\2\2\u0463\u0464\3\2\2\2\u0464\u0466\3\2\2\2\u0465\u0463\3\2\2\2\u0466"+
		"\u0467\7\4\2\2\u0467!\3\2\2\2\u0468\u046b\5\u00be`\2\u0469\u046a\7\u0080"+
		"\2\2\u046a\u046c\5\u0094K\2\u046b\u0469\3\2\2\2\u046b\u046c\3\2\2\2\u046c"+
		"#\3\2\2\2\u046d\u0473\5\u00bc_\2\u046e\u0473\7\u00ee\2\2\u046f\u0473\5"+
		"\u0096L\2\u0470\u0473\5\u0098M\2\u0471\u0473\5\u009aN\2\u0472\u046d\3"+
		"\2\2\2\u0472\u046e\3\2\2\2\u0472\u046f\3\2\2\2\u0472\u0470\3\2\2\2\u0472"+
		"\u0471\3\2\2\2\u0473%\3\2\2\2\u0474\u0479\5\u00be`\2\u0475\u0476\7\6\2"+
		"\2\u0476\u0478\5\u00be`\2\u0477\u0475\3\2\2\2\u0478\u047b\3\2\2\2\u0479"+
		"\u0477\3\2\2\2\u0479\u047a\3\2\2\2\u047a\'\3\2\2\2\u047b\u0479\3\2\2\2"+
		"\u047c\u047d\7L\2\2\u047d\u0482\5*\26\2\u047e\u047f\7\5\2\2\u047f\u0481"+
		"\5*\26\2\u0480\u047e\3\2\2\2\u0481\u0484\3\2\2\2\u0482\u0480\3\2\2\2\u0482"+
		"\u0483\3\2\2\2\u0483)\3\2\2\2\u0484\u0482\3\2\2\2\u0485\u0487\5\u00be"+
		"`\2\u0486\u0488\7\17\2\2\u0487\u0486\3\2\2\2\u0487\u0488\3\2\2\2\u0488"+
		"\u0489\3\2\2\2\u0489\u048a\7\3\2\2\u048a\u048b\5\32\16\2\u048b\u048c\7"+
		"\4\2\2\u048c+\3\2\2\2\u048d\u048e\7\u009d\2\2\u048e\u048f\5\u00bc_\2\u048f"+
		"-\3\2\2\2\u0490\u0491\7\3\2\2\u0491\u0496\5\60\31\2\u0492\u0493\7\5\2"+
		"\2\u0493\u0495\5\60\31\2\u0494\u0492\3\2\2\2\u0495\u0498\3\2\2\2\u0496"+
		"\u0494\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0499\3\2\2\2\u0498\u0496\3\2"+
		"\2\2\u0499\u049a\7\4\2\2\u049a/\3\2\2\2\u049b\u04a0\5\62\32\2\u049c\u049e"+
		"\7\u0080\2\2\u049d\u049c\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u049f\3\2\2"+
		"\2\u049f\u04a1\5\64\33\2\u04a0\u049d\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1"+
		"\61\3\2\2\2\u04a2\u04a7\5\u00be`\2\u04a3\u04a4\7\6\2\2\u04a4\u04a6\5\u00be"+
		"`\2\u04a5\u04a3\3\2\2\2\u04a6\u04a9\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a7"+
		"\u04a8\3\2\2\2\u04a8\u04ac\3\2\2\2\u04a9\u04a7\3\2\2\2\u04aa\u04ac\7\u00ee"+
		"\2\2\u04ab\u04a2\3\2\2\2\u04ab\u04aa\3\2\2\2\u04ac\63\3\2\2\2\u04ad\u04b2"+
		"\7\u00f2\2\2\u04ae\u04b2\7\u00f3\2\2\u04af\u04b2\5\u009cO\2\u04b0\u04b2"+
		"\7\u00ee\2\2\u04b1\u04ad\3\2\2\2\u04b1\u04ae\3\2\2\2\u04b1\u04af\3\2\2"+
		"\2\u04b1\u04b0\3\2\2\2\u04b2\65\3\2\2\2\u04b3\u04b4\7\3\2\2\u04b4\u04b9"+
		"\5\u0094K\2\u04b5\u04b6\7\5\2\2\u04b6\u04b8\5\u0094K\2\u04b7\u04b5\3\2"+
		"\2\2\u04b8\u04bb\3\2\2\2\u04b9\u04b7\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba"+
		"\u04bc\3\2\2\2\u04bb\u04b9\3\2\2\2\u04bc\u04bd\7\4\2\2\u04bd\67\3\2\2"+
		"\2\u04be\u04bf\7\3\2\2\u04bf\u04c4\5\66\34\2\u04c0\u04c1\7\5\2\2\u04c1"+
		"\u04c3\5\66\34\2\u04c2\u04c0\3\2\2\2\u04c3\u04c6\3\2\2\2\u04c4\u04c2\3"+
		"\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c7\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c7"+
		"\u04c8\7\4\2\2\u04c89\3\2\2\2\u04c9\u04ca\7\u00bb\2\2\u04ca\u04cb\7\17"+
		"\2\2\u04cb\u04d0\5<\37\2\u04cc\u04cd\7\u00bb\2\2\u04cd\u04ce\7\24\2\2"+
		"\u04ce\u04d0\5> \2\u04cf\u04c9\3\2\2\2\u04cf\u04cc\3\2\2\2\u04d0;\3\2"+
		"\2\2\u04d1\u04d2\7\u00cb\2\2\u04d2\u04d3\7\u00ee\2\2\u04d3\u04d4\7\u00cc"+
		"\2\2\u04d4\u04d7\7\u00ee\2\2\u04d5\u04d7\5\u00be`\2\u04d6\u04d1\3\2\2"+
		"\2\u04d6\u04d5\3\2\2\2\u04d7=\3\2\2\2\u04d8\u04dc\7\u00ee\2\2\u04d9\u04da"+
		"\7L\2\2\u04da\u04db\7\u009f\2\2\u04db\u04dd\5.\30\2\u04dc\u04d9\3\2\2"+
		"\2\u04dc\u04dd\3\2\2\2\u04dd?\3\2\2\2\u04de\u04df\5\u00be`\2\u04df\u04e0"+
		"\7\u00ee\2\2\u04e0A\3\2\2\2\u04e1\u04e3\5\34\17\2\u04e2\u04e1\3\2\2\2"+
		"\u04e2\u04e3\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5\5H%\2\u04e5\u04e6"+
		"\5D#\2\u04e6\u04ee\3\2\2\2\u04e7\u04e9\5T+\2\u04e8\u04ea\5F$\2\u04e9\u04e8"+
		"\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04e9\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec"+
		"\u04ee\3\2\2\2\u04ed\u04e2\3\2\2\2\u04ed\u04e7\3\2\2\2\u04eeC\3\2\2\2"+
		"\u04ef\u04f0\7\31\2\2\u04f0\u04f1\7\24\2\2\u04f1\u04f6\5L\'\2\u04f2\u04f3"+
		"\7\5\2\2\u04f3\u04f5\5L\'\2\u04f4\u04f2\3\2\2\2\u04f5\u04f8\3\2\2\2\u04f6"+
		"\u04f4\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04fa\3\2\2\2\u04f8\u04f6\3\2"+
		"\2\2\u04f9\u04ef\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u0505\3\2\2\2\u04fb"+
		"\u04fc\7\u0098\2\2\u04fc\u04fd\7\24\2\2\u04fd\u0502\5\u0088E\2\u04fe\u04ff"+
		"\7\5\2\2\u04ff\u0501\5\u0088E\2\u0500\u04fe\3\2\2\2\u0501\u0504\3\2\2"+
		"\2\u0502\u0500\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0506\3\2\2\2\u0504\u0502"+
		"\3\2\2\2\u0505\u04fb\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0511\3\2\2\2\u0507"+
		"\u0508\7\u0099\2\2\u0508\u0509\7\24\2\2\u0509\u050e\5\u0088E\2\u050a\u050b"+
		"\7\5\2\2\u050b\u050d\5\u0088E\2\u050c\u050a\3\2\2\2\u050d\u0510\3\2\2"+
		"\2\u050e\u050c\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0512\3\2\2\2\u0510\u050e"+
		"\3\2\2\2\u0511\u0507\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u051d\3\2\2\2\u0513"+
		"\u0514\7\u0097\2\2\u0514\u0515\7\24\2\2\u0515\u051a\5L\'\2\u0516\u0517"+
		"\7\5\2\2\u0517\u0519\5L\'\2\u0518\u0516\3\2\2\2\u0519\u051c\3\2\2\2\u051a"+
		"\u0518\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051e\3\2\2\2\u051c\u051a\3\2"+
		"\2\2\u051d\u0513\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u0520\3\2\2\2\u051f"+
		"\u0521\5\u00b2Z\2\u0520\u051f\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0527"+
		"\3\2\2\2\u0522\u0525\7\33\2\2\u0523\u0526\7\20\2\2\u0524\u0526\5\u0088"+
		"E\2\u0525\u0523\3\2\2\2\u0525\u0524\3\2\2\2\u0526\u0528\3\2\2\2\u0527"+
		"\u0522\3\2\2\2\u0527\u0528\3\2\2\2\u0528E\3\2\2\2\u0529\u052b\5\34\17"+
		"\2\u052a\u0529\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052d"+
		"\5N(\2\u052d\u052e\5D#\2\u052eG\3\2\2\2\u052f\u0530\b%\1\2\u0530\u0531"+
		"\5J&\2\u0531\u053a\3\2\2\2\u0532\u0533\f\3\2\2\u0533\u0535\t\t\2\2\u0534"+
		"\u0536\5\\/\2\u0535\u0534\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0537\3\2"+
		"\2\2\u0537\u0539\5H%\4\u0538\u0532\3\2\2\2\u0539\u053c\3\2\2\2\u053a\u0538"+
		"\3\2\2\2\u053a\u053b\3\2\2\2\u053bI\3\2\2\2\u053c\u053a\3\2\2\2\u053d"+
		"\u0546\5N(\2\u053e\u053f\7O\2\2\u053f\u0546\5\u0080A\2\u0540\u0546\5x"+
		"=\2\u0541\u0542\7\3\2\2\u0542\u0543\5B\"\2\u0543\u0544\7\4\2\2\u0544\u0546"+
		"\3\2\2\2\u0545\u053d\3\2\2\2\u0545\u053e\3\2\2\2\u0545\u0540\3\2\2\2\u0545"+
		"\u0541\3\2\2\2\u0546K\3\2\2\2\u0547\u0549\5\u0088E\2\u0548\u054a\t\n\2"+
		"\2\u0549\u0548\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054d\3\2\2\2\u054b\u054c"+
		"\7*\2\2\u054c\u054e\t\13\2\2\u054d\u054b\3\2\2\2\u054d\u054e\3\2\2\2\u054e"+
		"M\3\2\2\2\u054f\u0550\7\f\2\2\u0550\u0551\7\u009b\2\2\u0551\u0552\7\3"+
		"\2\2\u0552\u0553\5\u0086D\2\u0553\u0554\7\4\2\2\u0554\u055a\3\2\2\2\u0555"+
		"\u0556\7o\2\2\u0556\u055a\5\u0086D\2\u0557\u0558\7\u009c\2\2\u0558\u055a"+
		"\5\u0086D\2\u0559\u054f\3\2\2\2\u0559\u0555\3\2\2\2\u0559\u0557\3\2\2"+
		"\2\u055a\u055c\3\2\2\2\u055b\u055d\5~@\2\u055c\u055b\3\2\2\2\u055c\u055d"+
		"\3\2\2\2\u055d\u0560\3\2\2\2\u055e\u055f\7\u00a1\2\2\u055f\u0561\7\u00ee"+
		"\2\2\u0560\u055e\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0562\3\2\2\2\u0562"+
		"\u0563\7\u009d\2\2\u0563\u0570\7\u00ee\2\2\u0564\u056e\7\17\2\2\u0565"+
		"\u056f\5l\67\2\u0566\u056f\5\u00a8U\2\u0567\u056a\7\3\2\2\u0568\u056b"+
		"\5l\67\2\u0569\u056b\5\u00a8U\2\u056a\u0568\3\2\2\2\u056a\u0569\3\2\2"+
		"\2\u056b\u056c\3\2\2\2\u056c\u056d\7\4\2\2\u056d\u056f\3\2\2\2\u056e\u0565"+
		"\3\2\2\2\u056e\u0566\3\2\2\2\u056e\u0567\3\2\2\2\u056f\u0571\3\2\2\2\u0570"+
		"\u0564\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0573\3\2\2\2\u0572\u0574\5~"+
		"@\2\u0573\u0572\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0577\3\2\2\2\u0575"+
		"\u0576\7\u00a0\2\2\u0576\u0578\7\u00ee\2\2\u0577\u0575\3\2\2\2\u0577\u0578"+
		"\3\2\2\2\u0578\u057a\3\2\2\2\u0579\u057b\5T+\2\u057a\u0579\3\2\2\2\u057a"+
		"\u057b\3\2\2\2\u057b\u057e\3\2\2\2\u057c\u057d\7\22\2\2\u057d\u057f\5"+
		"\u008aF\2\u057e\u057c\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u05ad\3\2\2\2"+
		"\u0580\u0584\7\f\2\2\u0581\u0583\5P)\2\u0582\u0581\3\2\2\2\u0583\u0586"+
		"\3\2\2\2\u0584\u0582\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u0588\3\2\2\2\u0586"+
		"\u0584\3\2\2\2\u0587\u0589\5\\/\2\u0588\u0587\3\2\2\2\u0588\u0589\3\2"+
		"\2\2\u0589\u058a\3\2\2\2\u058a\u058c\5\u0086D\2\u058b\u058d\5T+\2\u058c"+
		"\u058b\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u0597\3\2\2\2\u058e\u0594\5T"+
		"+\2\u058f\u0591\7\f\2\2\u0590\u0592\5\\/\2\u0591\u0590\3\2\2\2\u0591\u0592"+
		"\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u0595\5\u0086D\2\u0594\u058f\3\2\2"+
		"\2\u0594\u0595\3\2\2\2\u0595\u0597\3\2\2\2\u0596\u0580\3\2\2\2\u0596\u058e"+
		"\3\2\2\2\u0597\u059b\3\2\2\2\u0598\u059a\5Z.\2\u0599\u0598\3\2\2\2\u059a"+
		"\u059d\3\2\2\2\u059b\u0599\3\2\2\2\u059b\u059c\3\2\2\2\u059c\u05a0\3\2"+
		"\2\2\u059d\u059b\3\2\2\2\u059e\u059f\7\22\2\2\u059f\u05a1\5\u008aF\2\u05a0"+
		"\u059e\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a3\3\2\2\2\u05a2\u05a4\5V"+
		",\2\u05a3\u05a2\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05a7\3\2\2\2\u05a5"+
		"\u05a6\7\32\2\2\u05a6\u05a8\5\u008aF\2\u05a7\u05a5\3\2\2\2\u05a7\u05a8"+
		"\3\2\2\2\u05a8\u05aa\3\2\2\2\u05a9\u05ab\5\u00b2Z\2\u05aa\u05a9\3\2\2"+
		"\2\u05aa\u05ab\3\2\2\2\u05ab\u05ad\3\2\2\2\u05ac\u0559\3\2\2\2\u05ac\u0596"+
		"\3\2\2\2\u05adO\3\2\2\2\u05ae\u05af\7\7\2\2\u05af\u05b6\5R*\2\u05b0\u05b2"+
		"\7\5\2\2\u05b1\u05b0\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3"+
		"\u05b5\5R*\2\u05b4\u05b1\3\2\2\2\u05b5\u05b8\3\2\2\2\u05b6\u05b4\3\2\2"+
		"\2\u05b6\u05b7\3\2\2\2\u05b7\u05b9\3\2\2\2\u05b8\u05b6\3\2\2\2\u05b9\u05ba"+
		"\7\b\2\2\u05baQ\3\2\2\2\u05bb\u05c9\5\u00be`\2\u05bc\u05bd\5\u00be`\2"+
		"\u05bd\u05be\7\3\2\2\u05be\u05c3\5\u0092J\2\u05bf\u05c0\7\5\2\2\u05c0"+
		"\u05c2\5\u0092J\2\u05c1\u05bf\3\2\2\2\u05c2\u05c5\3\2\2\2\u05c3\u05c1"+
		"\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u05c6\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c6"+
		"\u05c7\7\4\2\2\u05c7\u05c9\3\2\2\2\u05c8\u05bb\3\2\2\2\u05c8\u05bc\3\2"+
		"\2\2\u05c9S\3\2\2\2\u05ca\u05cb\7\r\2\2\u05cb\u05d0\5^\60\2\u05cc\u05cd"+
		"\7\5\2\2\u05cd\u05cf\5^\60\2\u05ce\u05cc\3\2\2\2\u05cf\u05d2\3\2\2\2\u05d0"+
		"\u05ce\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d6\3\2\2\2\u05d2\u05d0\3\2"+
		"\2\2\u05d3\u05d5\5Z.\2\u05d4\u05d3\3\2\2\2\u05d5\u05d8\3\2\2\2\u05d6\u05d4"+
		"\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7U\3\2\2\2\u05d8\u05d6\3\2\2\2\u05d9"+
		"\u05da\7\23\2\2\u05da\u05db\7\24\2\2\u05db\u05e0\5\u0088E\2\u05dc\u05dd"+
		"\7\5\2\2\u05dd\u05df\5\u0088E\2\u05de\u05dc\3\2\2\2\u05df\u05e2\3\2\2"+
		"\2\u05e0\u05de\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05f4\3\2\2\2\u05e2\u05e0"+
		"\3\2\2\2\u05e3\u05e4\7L\2\2\u05e4\u05f5\7\30\2\2\u05e5\u05e6\7L\2\2\u05e6"+
		"\u05f5\7\27\2\2\u05e7\u05e8\7\25\2\2\u05e8\u05e9\7\26\2\2\u05e9\u05ea"+
		"\7\3\2\2\u05ea\u05ef\5X-\2\u05eb\u05ec\7\5\2\2\u05ec\u05ee\5X-\2\u05ed"+
		"\u05eb\3\2\2\2\u05ee\u05f1\3\2\2\2\u05ef\u05ed\3\2\2\2\u05ef\u05f0\3\2"+
		"\2\2\u05f0\u05f2\3\2\2\2\u05f1\u05ef\3\2\2\2\u05f2\u05f3\7\4\2\2\u05f3"+
		"\u05f5\3\2\2\2\u05f4\u05e3\3\2\2\2\u05f4\u05e5\3\2\2\2\u05f4\u05e7\3\2"+
		"\2\2\u05f4\u05f5\3\2\2\2\u05f5W\3\2\2\2\u05f6\u05ff\7\3\2\2\u05f7\u05fc"+
		"\5\u0088E\2\u05f8\u05f9\7\5\2\2\u05f9\u05fb\5\u0088E\2\u05fa\u05f8\3\2"+
		"\2\2\u05fb\u05fe\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd"+
		"\u0600\3\2\2\2\u05fe\u05fc\3\2\2\2\u05ff\u05f7\3\2\2\2\u05ff\u0600\3\2"+
		"\2\2\u0600\u0601\3\2\2\2\u0601\u0604\7\4\2\2\u0602\u0604\5\u0088E\2\u0603"+
		"\u05f6\3\2\2\2\u0603\u0602\3\2\2\2\u0604Y\3\2\2\2\u0605\u0606\7>\2\2\u0606"+
		"\u0608\7Q\2\2\u0607\u0609\7\66\2\2\u0608\u0607\3\2\2\2\u0608\u0609\3\2"+
		"\2\2\u0609\u060a\3\2\2\2\u060a\u060b\5\u00bc_\2\u060b\u0614\7\3\2\2\u060c"+
		"\u0611\5\u0088E\2\u060d\u060e\7\5\2\2\u060e\u0610\5\u0088E\2\u060f\u060d"+
		"\3\2\2\2\u0610\u0613\3\2\2\2\u0611\u060f\3\2\2\2\u0611\u0612\3\2\2\2\u0612"+
		"\u0615\3\2\2\2\u0613\u0611\3\2\2\2\u0614\u060c\3\2\2\2\u0614\u0615\3\2"+
		"\2\2\u0615\u0616\3\2\2\2\u0616\u0617\7\4\2\2\u0617\u0623\5\u00be`\2\u0618"+
		"\u061a\7\17\2\2\u0619\u0618\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u061b\3"+
		"\2\2\2\u061b\u0620\5\u00be`\2\u061c\u061d\7\5\2\2\u061d\u061f\5\u00be"+
		"`\2\u061e\u061c\3\2\2\2\u061f\u0622\3\2\2\2\u0620\u061e\3\2\2\2\u0620"+
		"\u0621\3\2\2\2\u0621\u0624\3\2\2\2\u0622\u0620\3\2\2\2\u0623\u0619\3\2"+
		"\2\2\u0623\u0624\3\2\2\2\u0624[\3\2\2\2\u0625\u0626\t\f\2\2\u0626]\3\2"+
		"\2\2\u0627\u062b\5v<\2\u0628\u062a\5`\61\2\u0629\u0628\3\2\2\2\u062a\u062d"+
		"\3\2\2\2\u062b\u0629\3\2\2\2\u062b\u062c\3\2\2\2\u062c_\3\2\2\2\u062d"+
		"\u062b\3\2\2\2\u062e\u062f\5b\62\2\u062f\u0630\7\64\2\2\u0630\u0632\5"+
		"v<\2\u0631\u0633\5d\63\2\u0632\u0631\3\2\2\2\u0632\u0633\3\2\2\2\u0633"+
		"\u063a\3\2\2\2\u0634\u0635\7<\2\2\u0635\u0636\5b\62\2\u0636\u0637\7\64"+
		"\2\2\u0637\u0638\5v<\2\u0638\u063a\3\2\2\2\u0639\u062e\3\2\2\2\u0639\u0634"+
		"\3\2\2\2\u063aa\3\2\2\2\u063b\u063d\7\67\2\2\u063c\u063b\3\2\2\2\u063c"+
		"\u063d\3\2\2\2\u063d\u0652\3\2\2\2\u063e\u0652\7\65\2\2\u063f\u0641\7"+
		"8\2\2\u0640\u0642\7\66\2\2\u0641\u0640\3\2\2\2\u0641\u0642\3\2\2\2\u0642"+
		"\u0652\3\2\2\2\u0643\u0644\78\2\2\u0644\u0652\79\2\2\u0645\u0647\7:\2"+
		"\2\u0646\u0648\7\66\2\2\u0647\u0646\3\2\2\2\u0647\u0648\3\2\2\2\u0648"+
		"\u0652\3\2\2\2\u0649\u064b\7;\2\2\u064a\u064c\7\66\2\2\u064b\u064a\3\2"+
		"\2\2\u064b\u064c\3\2\2\2\u064c\u0652\3\2\2\2\u064d\u064f\78\2\2\u064e"+
		"\u064d\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u0652\7\u00eb"+
		"\2\2\u0651\u063c\3\2\2\2\u0651\u063e\3\2\2\2\u0651\u063f\3\2\2\2\u0651"+
		"\u0643\3\2\2\2\u0651\u0645\3\2\2\2\u0651\u0649\3\2\2\2\u0651\u064e\3\2"+
		"\2\2\u0652c\3\2\2\2\u0653\u0654\7=\2\2\u0654\u0662\5\u008aF\2\u0655\u0656"+
		"\7\u009d\2\2\u0656\u0657\7\3\2\2\u0657\u065c\5\u00be`\2\u0658\u0659\7"+
		"\5\2\2\u0659\u065b\5\u00be`\2\u065a\u0658\3\2\2\2\u065b\u065e\3\2\2\2"+
		"\u065c\u065a\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u065f\3\2\2\2\u065e\u065c"+
		"\3\2\2\2\u065f\u0660\7\4\2\2\u0660\u0662\3\2\2\2\u0661\u0653\3\2\2\2\u0661"+
		"\u0655\3\2\2\2\u0662e\3\2\2\2\u0663\u0664\7j\2\2\u0664\u0666\7\3\2\2\u0665"+
		"\u0667\5h\65\2\u0666\u0665\3\2\2\2\u0666\u0667\3\2\2\2\u0667\u0668\3\2"+
		"\2\2\u0668\u0669\7\4\2\2\u0669g\3\2\2\2\u066a\u066c\7\u0089\2\2\u066b"+
		"\u066a\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u066e\t\r"+
		"\2\2\u066e\u0683\7\u0093\2\2\u066f\u0670\5\u0088E\2\u0670\u0671\7C\2\2"+
		"\u0671\u0683\3\2\2\2\u0672\u0673\7\u0094\2\2\u0673\u0674\7\u00f2\2\2\u0674"+
		"\u0675\7\u0095\2\2\u0675\u0676\7\u0096\2\2\u0676\u067f\7\u00f2\2\2\u0677"+
		"\u067d\7=\2\2\u0678\u067e\5\u00be`\2\u0679\u067a\5\u00bc_\2\u067a\u067b"+
		"\7\3\2\2\u067b\u067c\7\4\2\2\u067c\u067e\3\2\2\2\u067d\u0678\3\2\2\2\u067d"+
		"\u0679\3\2\2\2\u067e\u0680\3\2\2\2\u067f\u0677\3\2\2\2\u067f\u0680\3\2"+
		"\2\2\u0680\u0683\3\2\2\2\u0681\u0683\5\u0088E\2\u0682\u066b\3\2\2\2\u0682"+
		"\u066f\3\2\2\2\u0682\u0672\3\2\2\2\u0682\u0681\3\2\2\2\u0683i\3\2\2\2"+
		"\u0684\u0685\7\3\2\2\u0685\u0686\5l\67\2\u0686\u0687\7\4\2\2\u0687k\3"+
		"\2\2\2\u0688\u068d\5\u00be`\2\u0689\u068a\7\5\2\2\u068a\u068c\5\u00be"+
		"`\2\u068b\u0689\3\2\2\2\u068c\u068f\3\2\2\2\u068d\u068b\3\2\2\2\u068d"+
		"\u068e\3\2\2\2\u068em\3\2\2\2\u068f\u068d\3\2\2\2\u0690\u0691\7\3\2\2"+
		"\u0691\u0696\5p9\2\u0692\u0693\7\5\2\2\u0693\u0695\5p9\2\u0694\u0692\3"+
		"\2\2\2\u0695\u0698\3\2\2\2\u0696\u0694\3\2\2\2\u0696\u0697\3\2\2\2\u0697"+
		"\u0699\3\2\2\2\u0698\u0696\3\2\2\2\u0699\u069a\7\4\2\2\u069ao\3\2\2\2"+
		"\u069b\u069d\5\u00be`\2\u069c\u069e\t\n\2\2\u069d\u069c\3\2\2\2\u069d"+
		"\u069e\3\2\2\2\u069eq\3\2\2\2\u069f\u06a0\7\3\2\2\u06a0\u06a5\5t;\2\u06a1"+
		"\u06a2\7\5\2\2\u06a2\u06a4\5t;\2\u06a3\u06a1\3\2\2\2\u06a4\u06a7\3\2\2"+
		"\2\u06a5\u06a3\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06a8\3\2\2\2\u06a7\u06a5"+
		"\3\2\2\2\u06a8\u06a9\7\4\2\2\u06a9s\3\2\2\2\u06aa\u06ad\5\u00be`\2\u06ab"+
		"\u06ac\7q\2\2\u06ac\u06ae\7\u00ee\2\2\u06ad\u06ab\3\2\2\2\u06ad\u06ae"+
		"\3\2\2\2\u06aeu\3\2\2\2\u06af\u06b1\5\u0080A\2\u06b0\u06b2\5f\64\2\u06b1"+
		"\u06b0\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b4\5|"+
		"?\2\u06b4\u06c8\3\2\2\2\u06b5\u06b6\7\3\2\2\u06b6\u06b7\5B\"\2\u06b7\u06b9"+
		"\7\4\2\2\u06b8\u06ba\5f\64\2\u06b9\u06b8\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba"+
		"\u06bb\3\2\2\2\u06bb\u06bc\5|?\2\u06bc\u06c8\3\2\2\2\u06bd\u06be\7\3\2"+
		"\2\u06be\u06bf\5^\60\2\u06bf\u06c1\7\4\2\2\u06c0\u06c2\5f\64\2\u06c1\u06c0"+
		"\3\2\2\2\u06c1\u06c2\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06c4\5|?\2\u06c4"+
		"\u06c8\3\2\2\2\u06c5\u06c8\5x=\2\u06c6\u06c8\5z>\2\u06c7\u06af\3\2\2\2"+
		"\u06c7\u06b5\3\2\2\2\u06c7\u06bd\3\2\2\2\u06c7\u06c5\3\2\2\2\u06c7\u06c6"+
		"\3\2\2\2\u06c8w\3\2\2\2\u06c9\u06ca\7M\2\2\u06ca\u06cf\5\u0088E\2\u06cb"+
		"\u06cc\7\5\2\2\u06cc\u06ce\5\u0088E\2\u06cd\u06cb\3\2\2\2\u06ce\u06d1"+
		"\3\2\2\2\u06cf\u06cd\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06d2\3\2\2\2\u06d1"+
		"\u06cf\3\2\2\2\u06d2\u06d3\5|?\2\u06d3y\3\2\2\2\u06d4\u06d5\5\u00be`\2"+
		"\u06d5\u06de\7\3\2\2\u06d6\u06db\5\u0088E\2\u06d7\u06d8\7\5\2\2\u06d8"+
		"\u06da\5\u0088E\2\u06d9\u06d7\3\2\2\2\u06da\u06dd\3\2\2\2\u06db\u06d9"+
		"\3\2\2\2\u06db\u06dc\3\2\2\2\u06dc\u06df\3\2\2\2\u06dd\u06db\3\2\2\2\u06de"+
		"\u06d6\3\2\2\2\u06de\u06df\3\2\2\2\u06df\u06e0\3\2\2\2\u06e0\u06e1\7\4"+
		"\2\2\u06e1\u06e2\5|?\2\u06e2{\3\2\2\2\u06e3\u06e5\7\17\2\2\u06e4\u06e3"+
		"\3\2\2\2\u06e4\u06e5\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6\u06e8\5\u00c0a"+
		"\2\u06e7\u06e9\5j\66\2\u06e8\u06e7\3\2\2\2\u06e8\u06e9\3\2\2\2\u06e9\u06eb"+
		"\3\2\2\2\u06ea\u06e4\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb}\3\2\2\2\u06ec"+
		"\u06ed\7K\2\2\u06ed\u06ee\7X\2\2\u06ee\u06ef\7\u009e\2\2\u06ef\u06f3\7"+
		"\u00ee\2\2\u06f0\u06f1\7L\2\2\u06f1\u06f2\7\u009f\2\2\u06f2\u06f4\5.\30"+
		"\2\u06f3\u06f0\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u071e\3\2\2\2\u06f5\u06f6"+
		"\7K\2\2\u06f6\u06f7\7X\2\2\u06f7\u0701\7\u00a2\2\2\u06f8\u06f9\7\u00a3"+
		"\2\2\u06f9\u06fa\7\u00a4\2\2\u06fa\u06fb\7\24\2\2\u06fb\u06ff\7\u00ee"+
		"\2\2\u06fc\u06fd\7\u00a8\2\2\u06fd\u06fe\7\24\2\2\u06fe\u0700\7\u00ee"+
		"\2\2\u06ff\u06fc\3\2\2\2\u06ff\u0700\3\2\2\2\u0700\u0702\3\2\2\2\u0701"+
		"\u06f8\3\2\2\2\u0701\u0702\3\2\2\2\u0702\u0708\3\2\2\2\u0703\u0704\7\u00a5"+
		"\2\2\u0704\u0705\7\u00a6\2\2\u0705\u0706\7\u00a4\2\2\u0706\u0707\7\24"+
		"\2\2\u0707\u0709\7\u00ee\2\2\u0708\u0703\3\2\2\2\u0708\u0709\3\2\2\2\u0709"+
		"\u070f\3\2\2\2\u070a\u070b\7o\2\2\u070b\u070c\7\u00a7\2\2\u070c\u070d"+
		"\7\u00a4\2\2\u070d\u070e\7\24\2\2\u070e\u0710\7\u00ee\2\2\u070f\u070a"+
		"\3\2\2\2\u070f\u0710\3\2\2\2\u0710\u0715\3\2\2\2\u0711\u0712\7\u00a9\2"+
		"\2\u0712\u0713\7\u00a4\2\2\u0713\u0714\7\24\2\2\u0714\u0716\7\u00ee\2"+
		"\2\u0715\u0711\3\2\2\2\u0715\u0716\3\2\2\2\u0716\u071b\3\2\2\2\u0717\u0718"+
		"\7\'\2\2\u0718\u0719\7\u00d7\2\2\u0719\u071a\7\17\2\2\u071a\u071c\7\u00ee"+
		"\2\2\u071b\u0717\3\2\2\2\u071b\u071c\3\2\2\2\u071c\u071e\3\2\2\2\u071d"+
		"\u06ec\3\2\2\2\u071d\u06f5\3\2\2\2\u071e\177\3\2\2\2\u071f\u0720\5\u00be"+
		"`\2\u0720\u0721\7\6\2\2\u0721\u0723\3\2\2\2\u0722\u071f\3\2\2\2\u0722"+
		"\u0723\3\2\2\2\u0723\u0724\3\2\2\2\u0724\u0725\5\u00be`\2\u0725\u0081"+
		"\3\2\2\2\u0726\u0727\5\u00be`\2\u0727\u0728\7\6\2\2\u0728\u072a\3\2\2"+
		"\2\u0729\u0726\3\2\2\2\u0729\u072a\3\2\2\2\u072a\u072b\3\2\2\2\u072b\u072c"+
		"\5\u00be`\2\u072c\u0083\3\2\2\2\u072d\u0735\5\u0088E\2\u072e\u0730\7\17"+
		"\2\2\u072f\u072e\3\2\2\2\u072f\u0730\3\2\2\2\u0730\u0733\3\2\2\2\u0731"+
		"\u0734\5\u00be`\2\u0732\u0734\5j\66\2\u0733\u0731\3\2\2\2\u0733\u0732"+
		"\3\2\2\2\u0734\u0736\3\2\2\2\u0735\u072f\3\2\2\2\u0735\u0736\3\2\2\2\u0736"+
		"\u0085\3\2\2\2\u0737\u073c\5\u0084C\2\u0738\u0739\7\5\2\2\u0739\u073b"+
		"\5\u0084C\2\u073a\u0738\3\2\2\2\u073b\u073e\3\2\2\2\u073c\u073a\3\2\2"+
		"\2\u073c\u073d\3\2\2\2\u073d\u0087\3\2\2\2\u073e\u073c\3\2\2\2\u073f\u0740"+
		"\5\u008aF\2\u0740\u0089\3\2\2\2\u0741\u0742\bF\1\2\u0742\u0743\7 \2\2"+
		"\u0743\u074b\5\u008aF\7\u0744\u0745\7\"\2\2\u0745\u0746\7\3\2\2\u0746"+
		"\u0747\5\32\16\2\u0747\u0748\7\4\2\2\u0748\u074b\3\2\2\2\u0749\u074b\5"+
		"\u008cG\2\u074a\u0741\3\2\2\2\u074a\u0744\3\2\2\2\u074a\u0749\3\2\2\2"+
		"\u074b\u0754\3\2\2\2\u074c\u074d\f\4\2\2\u074d\u074e\7\36\2\2\u074e\u0753"+
		"\5\u008aF\5\u074f\u0750\f\3\2\2\u0750\u0751\7\35\2\2\u0751\u0753\5\u008a"+
		"F\4\u0752\u074c\3\2\2\2\u0752\u074f\3\2\2\2\u0753\u0756\3\2\2\2\u0754"+
		"\u0752\3\2\2\2\u0754\u0755\3\2\2\2\u0755\u008b\3\2\2\2\u0756\u0754\3\2"+
		"\2\2\u0757\u0759\5\u0090I\2\u0758\u075a\5\u008eH\2\u0759\u0758\3\2\2\2"+
		"\u0759\u075a\3\2\2\2\u075a\u008d\3\2\2\2\u075b\u075d\7 \2\2\u075c\u075b"+
		"\3\2\2\2\u075c\u075d\3\2\2\2\u075d\u075e\3\2\2\2\u075e\u075f\7#\2\2\u075f"+
		"\u0760\5\u0090I\2\u0760\u0761\7\36\2\2\u0761\u0762\5\u0090I\2\u0762\u078c"+
		"\3\2\2\2\u0763\u0765\7 \2\2\u0764\u0763\3\2\2\2\u0764\u0765\3\2\2\2\u0765"+
		"\u0766\3\2\2\2\u0766\u0767\7\37\2\2\u0767\u0768\7\3\2\2\u0768\u076d\5"+
		"\u0088E\2\u0769\u076a\7\5\2\2\u076a\u076c\5\u0088E\2\u076b\u0769\3\2\2"+
		"\2\u076c\u076f\3\2\2\2\u076d\u076b\3\2\2\2\u076d\u076e\3\2\2\2\u076e\u0770"+
		"\3\2\2\2\u076f\u076d\3\2\2\2\u0770\u0771\7\4\2\2\u0771\u078c\3\2\2\2\u0772"+
		"\u0774\7 \2\2\u0773\u0772\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u0775\3\2"+
		"\2\2\u0775\u0776\7\37\2\2\u0776\u0777\7\3\2\2\u0777\u0778\5\32\16\2\u0778"+
		"\u0779\7\4\2\2\u0779\u078c\3\2\2\2\u077a\u077c\7 \2\2\u077b\u077a\3\2"+
		"\2\2\u077b\u077c\3\2\2\2\u077c\u077d\3\2\2\2\u077d\u077e\t\16\2\2\u077e"+
		"\u078c\5\u0090I\2\u077f\u0781\7&\2\2\u0780\u0782\7 \2\2\u0781\u0780\3"+
		"\2\2\2\u0781\u0782\3\2\2\2\u0782\u0783\3\2\2\2\u0783\u078c\7\'\2\2\u0784"+
		"\u0786\7&\2\2\u0785\u0787\7 \2\2\u0786\u0785\3\2\2\2\u0786\u0787\3\2\2"+
		"\2\u0787\u0788\3\2\2\2\u0788\u0789\7\21\2\2\u0789\u078a\7\r\2\2\u078a"+
		"\u078c\5\u0090I\2\u078b\u075c\3\2\2\2\u078b\u0764\3\2\2\2\u078b\u0773"+
		"\3\2\2\2\u078b\u077b\3\2\2\2\u078b\u077f\3\2\2\2\u078b\u0784\3\2\2\2\u078c"+
		"\u008f\3\2\2\2\u078d\u078e\bI\1\2\u078e\u0792\5\u0092J\2\u078f\u0790\t"+
		"\17\2\2\u0790\u0792\5\u0090I\t\u0791\u078d\3\2\2\2\u0791\u078f\3\2\2\2"+
		"\u0792\u07a8\3\2\2\2\u0793\u0794\f\b\2\2\u0794\u0795\t\20\2\2\u0795\u07a7"+
		"\5\u0090I\t\u0796\u0797\f\7\2\2\u0797\u0798\t\21\2\2\u0798\u07a7\5\u0090"+
		"I\b\u0799\u079a\f\6\2\2\u079a\u079b\7\u008f\2\2\u079b\u07a7\5\u0090I\7"+
		"\u079c\u079d\f\5\2\2\u079d\u079e\7\u0092\2\2\u079e\u07a7\5\u0090I\6\u079f"+
		"\u07a0\f\4\2\2\u07a0\u07a1\7\u0090\2\2\u07a1\u07a7\5\u0090I\5\u07a2\u07a3"+
		"\f\3\2\2\u07a3\u07a4\5\u0096L\2\u07a4\u07a5\5\u0090I\4\u07a5\u07a7\3\2"+
		"\2\2\u07a6\u0793\3\2\2\2\u07a6\u0796\3\2\2\2\u07a6\u0799\3\2\2\2\u07a6"+
		"\u079c\3\2\2\2\u07a6\u079f\3\2\2\2\u07a6\u07a2\3\2\2\2\u07a7\u07aa\3\2"+
		"\2\2\u07a8\u07a6\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9\u0091\3\2\2\2\u07aa"+
		"\u07a8\3\2\2\2\u07ab\u07ac\bJ\1\2\u07ac\u07ae\7/\2\2\u07ad\u07af\5\u00b0"+
		"Y\2\u07ae\u07ad\3\2\2\2\u07af\u07b0\3\2\2\2\u07b0\u07ae\3\2\2\2\u07b0"+
		"\u07b1\3\2\2\2\u07b1\u07b4\3\2\2\2\u07b2\u07b3\7\62\2\2\u07b3\u07b5\5"+
		"\u0088E\2\u07b4\u07b2\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5\u07b6\3\2\2\2"+
		"\u07b6\u07b7\7\63\2\2\u07b7\u0828\3\2\2\2\u07b8\u07b9\7/\2\2\u07b9\u07bb"+
		"\5\u0088E\2\u07ba\u07bc\5\u00b0Y\2\u07bb\u07ba\3\2\2\2\u07bc\u07bd\3\2"+
		"\2\2\u07bd\u07bb\3\2\2\2\u07bd\u07be\3\2\2\2\u07be\u07c1\3\2\2\2\u07bf"+
		"\u07c0\7\62\2\2\u07c0\u07c2\5\u0088E\2\u07c1\u07bf\3\2\2\2\u07c1\u07c2"+
		"\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3\u07c4\7\63\2\2\u07c4\u0828\3\2\2\2"+
		"\u07c5\u07c6\7\\\2\2\u07c6\u07c7\7\3\2\2\u07c7\u07c8\5\u0088E\2\u07c8"+
		"\u07c9\7\17\2\2\u07c9\u07ca\5\u00a6T\2\u07ca\u07cb\7\4\2\2\u07cb\u0828"+
		"\3\2\2\2\u07cc\u07cd\7p\2\2\u07cd\u07d6\7\3\2\2\u07ce\u07d3\5\u0084C\2"+
		"\u07cf\u07d0\7\5\2\2\u07d0\u07d2\5\u0084C\2\u07d1\u07cf\3\2\2\2\u07d2"+
		"\u07d5\3\2\2\2\u07d3\u07d1\3\2\2\2\u07d3\u07d4\3\2\2\2\u07d4\u07d7\3\2"+
		"\2\2\u07d5\u07d3\3\2\2\2\u07d6\u07ce\3\2\2\2\u07d6\u07d7\3\2\2\2\u07d7"+
		"\u07d8\3\2\2\2\u07d8\u0828\7\4\2\2\u07d9\u07da\7H\2\2\u07da\u07db\7\3"+
		"\2\2\u07db\u07de\5\u0088E\2\u07dc\u07dd\7z\2\2\u07dd\u07df\7*\2\2\u07de"+
		"\u07dc\3\2\2\2\u07de\u07df\3\2\2\2\u07df\u07e0\3\2\2\2\u07e0\u07e1\7\4"+
		"\2\2\u07e1\u0828\3\2\2\2\u07e2\u07e3\7J\2\2\u07e3\u07e4\7\3\2\2\u07e4"+
		"\u07e7\5\u0088E\2\u07e5\u07e6\7z\2\2\u07e6\u07e8\7*\2\2\u07e7\u07e5\3"+
		"\2\2\2\u07e7\u07e8\3\2\2\2\u07e8\u07e9\3\2\2\2\u07e9\u07ea\7\4\2\2\u07ea"+
		"\u0828\3\2\2\2\u07eb\u07ec\7\177\2\2\u07ec\u07ed\7\3\2\2\u07ed\u07ee\5"+
		"\u0090I\2\u07ee\u07ef\7\37\2\2\u07ef\u07f0\5\u0090I\2\u07f0\u07f1\7\4"+
		"\2\2\u07f1\u0828\3\2\2\2\u07f2\u0828\5\u0094K\2\u07f3\u0828\7\u008a\2"+
		"\2\u07f4\u07f5\5\u00bc_\2\u07f5\u07f6\7\6\2\2\u07f6\u07f7\7\u008a\2\2"+
		"\u07f7\u0828\3\2\2\2\u07f8\u07f9\7\3\2\2\u07f9\u07fc\5\u0084C\2\u07fa"+
		"\u07fb\7\5\2\2\u07fb\u07fd\5\u0084C\2\u07fc\u07fa\3\2\2\2\u07fd\u07fe"+
		"\3\2\2\2\u07fe\u07fc\3\2\2\2\u07fe\u07ff\3\2\2\2\u07ff\u0800\3\2\2\2\u0800"+
		"\u0801\7\4\2\2\u0801\u0828\3\2\2\2\u0802\u0803\7\3\2\2\u0803\u0804\5\32"+
		"\16\2\u0804\u0805\7\4\2\2\u0805\u0828\3\2\2\2\u0806\u0807\5\u00bc_\2\u0807"+
		"\u0813\7\3\2\2\u0808\u080a\5\\/\2\u0809\u0808\3\2\2\2\u0809\u080a\3\2"+
		"\2\2\u080a\u080b\3\2\2\2\u080b\u0810\5\u0088E\2\u080c\u080d\7\5\2\2\u080d"+
		"\u080f\5\u0088E\2\u080e\u080c\3\2\2\2\u080f\u0812\3\2\2\2\u0810\u080e"+
		"\3\2\2\2\u0810\u0811\3\2\2\2\u0811\u0814\3\2\2\2\u0812\u0810\3\2\2\2\u0813"+
		"\u0809\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u0815\3\2\2\2\u0815\u0818\7\4"+
		"\2\2\u0816\u0817\7@\2\2\u0817\u0819\5\u00b6\\\2\u0818\u0816\3\2\2\2\u0818"+
		"\u0819\3\2\2\2\u0819\u0828\3\2\2\2\u081a\u081b\5\u00bc_\2\u081b\u081c"+
		"\7\3\2\2\u081c\u081d\t\22\2\2\u081d\u081e\5\u0088E\2\u081e\u081f\7\r\2"+
		"\2\u081f\u0820\5\u0088E\2\u0820\u0821\7\4\2\2\u0821\u0828\3\2\2\2\u0822"+
		"\u0828\5\u00be`\2\u0823\u0824\7\3\2\2\u0824\u0825\5\u0088E\2\u0825\u0826"+
		"\7\4\2\2\u0826\u0828\3\2\2\2\u0827\u07ab\3\2\2\2\u0827\u07b8\3\2\2\2\u0827"+
		"\u07c5\3\2\2\2\u0827\u07cc\3\2\2\2\u0827\u07d9\3\2\2\2\u0827\u07e2\3\2"+
		"\2\2\u0827\u07eb\3\2\2\2\u0827\u07f2\3\2\2\2\u0827\u07f3\3\2\2\2\u0827"+
		"\u07f4\3\2\2\2\u0827\u07f8\3\2\2\2\u0827\u0802\3\2\2\2\u0827\u0806\3\2"+
		"\2\2\u0827\u081a\3\2\2\2\u0827\u0822\3\2\2\2\u0827\u0823\3\2\2\2\u0828"+
		"\u0833\3\2\2\2\u0829\u082a\f\6\2\2\u082a\u082b\7\t\2\2\u082b\u082c\5\u0090"+
		"I\2\u082c\u082d\7\n\2\2\u082d\u0832\3\2\2\2\u082e\u082f\f\4\2\2\u082f"+
		"\u0830\7\6\2\2\u0830\u0832\5\u00be`\2\u0831\u0829\3\2\2\2\u0831\u082e"+
		"\3\2\2\2\u0832\u0835\3\2\2\2\u0833\u0831\3\2\2\2\u0833\u0834\3\2\2\2\u0834"+
		"\u0093\3\2\2\2\u0835\u0833\3\2\2\2\u0836\u0843\7\'\2\2\u0837\u0843\5\u009e"+
		"P\2\u0838\u0839\5\u00be`\2\u0839\u083a\7\u00ee\2\2\u083a\u0843\3\2\2\2"+
		"\u083b\u0843\5\u00c4c\2\u083c\u0843\5\u009cO\2\u083d\u083f\7\u00ee\2\2"+
		"\u083e\u083d\3\2\2\2\u083f\u0840\3\2\2\2\u0840\u083e\3\2\2\2\u0840\u0841"+
		"\3\2\2\2\u0841\u0843\3\2\2\2\u0842\u0836\3\2\2\2\u0842\u0837\3\2\2\2\u0842"+
		"\u0838\3\2\2\2\u0842\u083b\3\2\2\2\u0842\u083c\3\2\2\2\u0842\u083e\3\2"+
		"\2\2\u0843\u0095\3\2\2\2\u0844\u0845\t\23\2\2\u0845\u0097\3\2\2\2\u0846"+
		"\u0847\t\24\2\2\u0847\u0099\3\2\2\2\u0848\u0849\t\25\2\2\u0849\u009b\3"+
		"\2\2\2\u084a\u084b\t\26\2\2\u084b\u009d\3\2\2\2\u084c\u0850\7.\2\2\u084d"+
		"\u084f\5\u00a0Q\2\u084e\u084d\3\2\2\2\u084f\u0852\3\2\2\2\u0850\u084e"+
		"\3\2\2\2\u0850\u0851\3\2\2\2\u0851\u009f\3\2\2\2\u0852\u0850\3\2\2\2\u0853"+
		"\u0854\5\u00a2R\2\u0854\u0857\5\u00be`\2\u0855\u0856\7i\2\2\u0856\u0858"+
		"\5\u00be`\2\u0857\u0855\3\2\2\2\u0857\u0858\3\2\2\2\u0858\u00a1\3\2\2"+
		"\2\u0859\u085b\t\27\2\2\u085a\u0859\3\2\2\2\u085a\u085b\3\2\2\2\u085b"+
		"\u085c\3\2\2\2\u085c\u085f\t\r\2\2\u085d\u085f\7\u00ee\2\2\u085e\u085a"+
		"\3\2\2\2\u085e\u085d\3\2\2\2\u085f\u00a3\3\2\2\2\u0860\u0864\7H\2\2\u0861"+
		"\u0862\7I\2\2\u0862\u0864\5\u00be`\2\u0863\u0860\3\2\2\2\u0863\u0861\3"+
		"\2\2\2\u0864\u00a5\3\2\2\2\u0865\u0866\7n\2\2\u0866\u0867\7\u0084\2\2"+
		"\u0867\u0868\5\u00a6T\2\u0868\u0869\7\u0086\2\2\u0869\u0888\3\2\2\2\u086a"+
		"\u086b\7o\2\2\u086b\u086c\7\u0084\2\2\u086c\u086d\5\u00a6T\2\u086d\u086e"+
		"\7\5\2\2\u086e\u086f\5\u00a6T\2\u086f\u0870\7\u0086\2\2\u0870\u0888\3"+
		"\2\2\2\u0871\u0878\7p\2\2\u0872\u0874\7\u0084\2\2\u0873\u0875\5\u00ac"+
		"W\2\u0874\u0873\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u0876\3\2\2\2\u0876"+
		"\u0879\7\u0086\2\2\u0877\u0879\7\u0082\2\2\u0878\u0872\3\2\2\2\u0878\u0877"+
		"\3\2\2\2\u0879\u0888\3\2\2\2\u087a\u0885\5\u00be`\2\u087b\u087c\7\3\2"+
		"\2\u087c\u0881\7\u00f2\2\2\u087d\u087e\7\5\2\2\u087e\u0880\7\u00f2\2\2"+
		"\u087f\u087d\3\2\2\2\u0880\u0883\3\2\2\2\u0881\u087f\3\2\2\2\u0881\u0882"+
		"\3\2\2\2\u0882\u0884\3\2\2\2\u0883\u0881\3\2\2\2\u0884\u0886\7\4\2\2\u0885"+
		"\u087b\3\2\2\2\u0885\u0886\3\2\2\2\u0886\u0888\3\2\2\2\u0887\u0865\3\2"+
		"\2\2\u0887\u086a\3\2\2\2\u0887\u0871\3\2\2\2\u0887\u087a\3\2\2\2\u0888"+
		"\u00a7\3\2\2\2\u0889\u088e\5\u00aaV\2\u088a\u088b\7\5\2\2\u088b\u088d"+
		"\5\u00aaV\2\u088c\u088a\3\2\2\2\u088d\u0890\3\2\2\2\u088e\u088c\3\2\2"+
		"\2\u088e\u088f\3\2\2\2\u088f\u00a9\3\2\2\2\u0890\u088e\3\2\2\2\u0891\u0892"+
		"\5\u00be`\2\u0892\u0895\5\u00a6T\2\u0893\u0894\7q\2\2\u0894\u0896\7\u00ee"+
		"\2\2\u0895\u0893\3\2\2\2\u0895\u0896\3\2\2\2\u0896\u00ab\3\2\2\2\u0897"+
		"\u089c\5\u00aeX\2\u0898\u0899\7\5\2\2\u0899\u089b\5\u00aeX\2\u089a\u0898"+
		"\3\2\2\2\u089b\u089e\3\2\2\2\u089c\u089a\3\2\2\2\u089c\u089d\3\2\2\2\u089d"+
		"\u00ad\3\2\2\2\u089e\u089c\3\2\2\2\u089f\u08a0\5\u00be`\2\u08a0\u08a1"+
		"\7\13\2\2\u08a1\u08a4\5\u00a6T\2\u08a2\u08a3\7q\2\2\u08a3\u08a5\7\u00ee"+
		"\2\2\u08a4\u08a2\3\2\2\2\u08a4\u08a5\3\2\2\2\u08a5\u00af\3\2\2\2\u08a6"+
		"\u08a7\7\60\2\2\u08a7\u08a8\5\u0088E\2\u08a8\u08a9\7\61\2\2\u08a9\u08aa"+
		"\5\u0088E\2\u08aa\u00b1\3\2\2\2\u08ab\u08ac\7?\2\2\u08ac\u08b1\5\u00b4"+
		"[\2\u08ad\u08ae\7\5\2\2\u08ae\u08b0\5\u00b4[\2\u08af\u08ad\3\2\2\2\u08b0"+
		"\u08b3\3\2\2\2\u08b1\u08af\3\2\2\2\u08b1\u08b2\3\2\2\2\u08b2\u00b3\3\2"+
		"\2\2\u08b3\u08b1\3\2\2\2\u08b4\u08b5\5\u00be`\2\u08b5\u08b6\7\17\2\2\u08b6"+
		"\u08b7\5\u00b6\\\2\u08b7\u00b5\3\2\2\2\u08b8\u08e3\5\u00be`\2\u08b9\u08dc"+
		"\7\3\2\2\u08ba\u08bb\7\u0098\2\2\u08bb\u08bc\7\24\2\2\u08bc\u08c1\5\u0088"+
		"E\2\u08bd\u08be\7\5\2\2\u08be\u08c0\5\u0088E\2\u08bf\u08bd\3\2\2\2\u08c0"+
		"\u08c3\3\2\2\2\u08c1\u08bf\3\2\2\2\u08c1\u08c2\3\2\2\2\u08c2\u08dd\3\2"+
		"\2\2\u08c3\u08c1\3\2\2\2\u08c4\u08c5\t\30\2\2\u08c5\u08c6\7\24\2\2\u08c6"+
		"\u08cb\5\u0088E\2\u08c7\u08c8\7\5\2\2\u08c8\u08ca\5\u0088E\2\u08c9\u08c7"+
		"\3\2\2\2\u08ca\u08cd\3\2\2\2\u08cb\u08c9\3\2\2\2\u08cb\u08cc\3\2\2\2\u08cc"+
		"\u08cf\3\2\2\2\u08cd\u08cb\3\2\2\2\u08ce\u08c4\3\2\2\2\u08ce\u08cf\3\2"+
		"\2\2\u08cf\u08da\3\2\2\2\u08d0\u08d1\t\31\2\2\u08d1\u08d2\7\24\2\2\u08d2"+
		"\u08d7\5L\'\2\u08d3\u08d4\7\5\2\2\u08d4\u08d6\5L\'\2\u08d5\u08d3\3\2\2"+
		"\2\u08d6\u08d9\3\2\2\2\u08d7\u08d5\3\2\2\2\u08d7\u08d8\3\2\2\2\u08d8\u08db"+
		"\3\2\2\2\u08d9\u08d7\3\2\2\2\u08da\u08d0\3\2\2\2\u08da\u08db\3\2\2\2\u08db"+
		"\u08dd\3\2\2\2\u08dc\u08ba\3\2\2\2\u08dc\u08ce\3\2\2\2\u08dd\u08df\3\2"+
		"\2\2\u08de\u08e0\5\u00b8]\2\u08df\u08de\3\2\2\2\u08df\u08e0\3\2\2\2\u08e0"+
		"\u08e1\3\2\2\2\u08e1\u08e3\7\4\2\2\u08e2\u08b8\3\2\2\2\u08e2\u08b9\3\2"+
		"\2\2\u08e3\u00b7\3\2\2\2\u08e4\u08e5\7B\2\2\u08e5\u08f5\5\u00ba^\2\u08e6"+
		"\u08e7\7C\2\2\u08e7\u08f5\5\u00ba^\2\u08e8\u08e9\7B\2\2\u08e9\u08ea\7"+
		"#\2\2\u08ea\u08eb\5\u00ba^\2\u08eb\u08ec\7\36\2\2\u08ec\u08ed\5\u00ba"+
		"^\2\u08ed\u08f5\3\2\2\2\u08ee\u08ef\7C\2\2\u08ef\u08f0\7#\2\2\u08f0\u08f1"+
		"\5\u00ba^\2\u08f1\u08f2\7\36\2\2\u08f2\u08f3\5\u00ba^\2\u08f3\u08f5\3"+
		"\2\2\2\u08f4\u08e4\3\2\2\2\u08f4\u08e6\3\2\2\2\u08f4\u08e8\3\2\2\2\u08f4"+
		"\u08ee\3\2\2\2\u08f5\u00b9\3\2\2\2\u08f6\u08f7\7D\2\2\u08f7\u08fe\t\32"+
		"\2\2\u08f8\u08f9\7G\2\2\u08f9\u08fe\7K\2\2\u08fa\u08fb\5\u0088E\2\u08fb"+
		"\u08fc\t\32\2\2\u08fc\u08fe\3\2\2\2\u08fd\u08f6\3\2\2\2\u08fd\u08f8\3"+
		"\2\2\2\u08fd\u08fa\3\2\2\2\u08fe\u00bb\3\2\2\2\u08ff\u0904\5\u00be`\2"+
		"\u0900\u0901\7\6\2\2\u0901\u0903\5\u00be`\2\u0902\u0900\3\2\2\2\u0903"+
		"\u0906\3\2\2\2\u0904\u0902\3\2\2\2\u0904\u0905\3\2\2\2\u0905\u00bd\3\2"+
		"\2\2\u0906\u0904\3\2\2\2\u0907\u0917\5\u00c0a\2\u0908\u0917\7\u00eb\2"+
		"\2\u0909\u0917\7;\2\2\u090a\u0917\7\67\2\2\u090b\u0917\78\2\2\u090c\u0917"+
		"\79\2\2\u090d\u0917\7:\2\2\u090e\u0917\7<\2\2\u090f\u0917\7\64\2\2\u0910"+
		"\u0917\7\65\2\2\u0911\u0917\7=\2\2\u0912\u0917\7e\2\2\u0913\u0917\7h\2"+
		"\2\u0914\u0917\7f\2\2\u0915\u0917\7g\2\2\u0916\u0907\3\2\2\2\u0916\u0908"+
		"\3\2\2\2\u0916\u0909\3\2\2\2\u0916\u090a\3\2\2\2\u0916\u090b\3\2\2\2\u0916"+
		"\u090c\3\2\2\2\u0916\u090d\3\2\2\2\u0916\u090e\3\2\2\2\u0916\u090f\3\2"+
		"\2\2\u0916\u0910\3\2\2\2\u0916\u0911\3\2\2\2\u0916\u0912\3\2\2\2\u0916"+
		"\u0913\3\2\2\2\u0916\u0914\3\2\2\2\u0916\u0915\3\2\2\2\u0917\u00bf\3\2"+
		"\2\2\u0918\u091c\7\u00f6\2\2\u0919\u091c\5\u00c2b\2\u091a\u091c\5\u00c6"+
		"d\2\u091b\u0918\3\2\2\2\u091b\u0919\3\2\2\2\u091b\u091a\3\2\2\2\u091c"+
		"\u00c1\3\2\2\2\u091d\u091e\7\u00f7\2\2\u091e\u00c3\3\2\2\2\u091f\u0921"+
		"\7\u0089\2\2\u0920\u091f\3\2\2\2\u0920\u0921\3\2\2\2\u0921\u0922\3\2\2"+
		"\2\u0922\u093c\7\u00f3\2\2\u0923\u0925\7\u0089\2\2\u0924\u0923\3\2\2\2"+
		"\u0924\u0925\3\2\2\2\u0925\u0926\3\2\2\2\u0926\u093c\7\u00f2\2\2\u0927"+
		"\u0929\7\u0089\2\2\u0928\u0927\3\2\2\2\u0928\u0929\3\2\2\2\u0929\u092a"+
		"\3\2\2\2\u092a\u093c\7\u00ef\2\2\u092b\u092d\7\u0089\2\2\u092c\u092b\3"+
		"\2\2\2\u092c\u092d\3\2\2\2\u092d\u092e\3\2\2\2\u092e\u093c\7\u00f0\2\2"+
		"\u092f\u0931\7\u0089\2\2\u0930\u092f\3\2\2\2\u0930\u0931\3\2\2\2\u0931"+
		"\u0932\3\2\2\2\u0932\u093c\7\u00f1\2\2\u0933\u0935\7\u0089\2\2\u0934\u0933"+
		"\3\2\2\2\u0934\u0935\3\2\2\2\u0935\u0936\3\2\2";
	private static final String _serializedATNSegment1 =
		"\2\u0936\u093c\7\u00f4\2\2\u0937\u0939\7\u0089\2\2\u0938\u0937\3\2\2\2"+
		"\u0938\u0939\3\2\2\2\u0939\u093a\3\2\2\2\u093a\u093c\7\u00f5\2\2\u093b"+
		"\u0920\3\2\2\2\u093b\u0924\3\2\2\2\u093b\u0928\3\2\2\2\u093b\u092c\3\2"+
		"\2\2\u093b\u0930\3\2\2\2\u093b\u0934\3\2\2\2\u093b\u0938\3\2\2\2\u093c"+
		"\u00c5\3\2\2\2\u093d\u093e\t\33\2\2\u093e\u00c7\3\2\2\2\u0145\u00e2\u00e7"+
		"\u00ea\u00ef\u00fc\u0100\u0107\u010c\u0111\u0114\u0117\u011b\u011f\u0122"+
		"\u0125\u012c\u0130\u0138\u013b\u013e\u0141\u0144\u0147\u014b\u014e\u0151"+
		"\u0158\u015e\u0164\u016c\u018c\u0194\u0198\u019d\u01a3\u01ab\u01b1\u01be"+
		"\u01c3\u01cc\u01d1\u01e1\u01e8\u01ec\u01f4\u01fb\u0202\u0211\u0215\u021b"+
		"\u0221\u0224\u0227\u022d\u0231\u0235\u023a\u023e\u0246\u0249\u0252\u0257"+
		"\u025d\u0264\u0267\u026d\u0278\u027b\u027f\u0284\u0289\u0290\u0293\u0296"+
		"\u029d\u02a2\u02a8\u02b1\u02b9\u02bf\u02c3\u02c7\u02cb\u02cd\u02d6\u02dc"+
		"\u02e1\u02e4\u02e8\u02eb\u02f5\u02f8\u02fc\u0301\u0304\u030a\u0312\u0317"+
		"\u031d\u0323\u032e\u0336\u033d\u0345\u0348\u0350\u0354\u035b\u03cf\u03d7"+
		"\u03df\u03e8\u03f4\u03f8\u03fb\u0401\u040b\u0417\u041c\u0422\u042e\u0430"+
		"\u0435\u0439\u043e\u0443\u0446\u044b\u044f\u0454\u0456\u045a\u0463\u046b"+
		"\u0472\u0479\u0482\u0487\u0496\u049d\u04a0\u04a7\u04ab\u04b1\u04b9\u04c4"+
		"\u04cf\u04d6\u04dc\u04e2\u04eb\u04ed\u04f6\u04f9\u0502\u0505\u050e\u0511"+
		"\u051a\u051d\u0520\u0525\u0527\u052a\u0535\u053a\u0545\u0549\u054d\u0559"+
		"\u055c\u0560\u056a\u056e\u0570\u0573\u0577\u057a\u057e\u0584\u0588\u058c"+
		"\u0591\u0594\u0596\u059b\u05a0\u05a3\u05a7\u05aa\u05ac\u05b1\u05b6\u05c3"+
		"\u05c8\u05d0\u05d6\u05e0\u05ef\u05f4\u05fc\u05ff\u0603\u0608\u0611\u0614"+
		"\u0619\u0620\u0623\u062b\u0632\u0639\u063c\u0641\u0647\u064b\u064e\u0651"+
		"\u065c\u0661\u0666\u066b\u067d\u067f\u0682\u068d\u0696\u069d\u06a5\u06ad"+
		"\u06b1\u06b9\u06c1\u06c7\u06cf\u06db\u06de\u06e4\u06e8\u06ea\u06f3\u06ff"+
		"\u0701\u0708\u070f\u0715\u071b\u071d\u0722\u0729\u072f\u0733\u0735\u073c"+
		"\u074a\u0752\u0754\u0759\u075c\u0764\u076d\u0773\u077b\u0781\u0786\u078b"+
		"\u0791\u07a6\u07a8\u07b0\u07b4\u07bd\u07c1\u07d3\u07d6\u07de\u07e7\u07fe"+
		"\u0809\u0810\u0813\u0818\u0827\u0831\u0833\u0840\u0842\u0850\u0857\u085a"+
		"\u085e\u0863\u0874\u0878\u0881\u0885\u0887\u088e\u0895\u089c\u08a4\u08b1"+
		"\u08c1\u08cb\u08ce\u08d7\u08da\u08dc\u08df\u08e2\u08f4\u08fd\u0904\u0916"+
		"\u091b\u0920\u0924\u0928\u092c\u0930\u0934\u0938\u093b";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}