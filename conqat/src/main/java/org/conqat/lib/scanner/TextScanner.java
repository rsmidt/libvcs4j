/* The following code was generated by JFlex 1.4.2 on {{TIMESTAMP}} */

package org.conqat.lib.scanner;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.2
 * on {{TIMESTAMP}} from the specification file
 * <tt>/home/freakout/cqse/repositories/conqat/trunk/lib/org.conqat.lib.scanner/grammars/text.flex</tt>
 */
class TextScanner implements ILenientScanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\5\1\3\1\2\1\0\1\4\1\1\16\5\4\0\1\3\1\12"+
    "\2\0\1\5\6\0\1\6\1\10\1\6\1\11\1\0\12\7\1\15"+
    "\1\14\3\0\1\13\1\0\32\5\4\0\1\5\1\0\32\5\4\0"+
    "\41\5\2\0\4\5\4\0\1\5\2\0\1\5\7\0\1\5\4\0"+
    "\1\5\5\0\27\5\1\0\37\5\1\0\u01ca\5\4\0\14\5\16\0"+
    "\5\5\7\0\1\5\1\0\1\5\21\0\165\5\1\0\2\5\2\0"+
    "\4\5\10\0\1\5\1\0\3\5\1\0\1\5\1\0\24\5\1\0"+
    "\123\5\1\0\213\5\1\0\5\5\2\0\236\5\11\0\46\5\2\0"+
    "\1\5\7\0\47\5\11\0\55\5\1\0\1\5\1\0\2\5\1\0"+
    "\2\5\1\0\1\5\10\0\33\5\5\0\3\5\15\0\4\5\7\0"+
    "\1\5\4\0\13\5\5\0\100\5\12\7\4\0\146\5\1\0\11\5"+
    "\1\0\12\5\1\0\6\5\12\7\3\5\2\0\1\5\17\0\74\5"+
    "\2\0\145\5\16\0\12\7\54\5\4\0\1\5\5\0\56\5\22\0"+
    "\34\5\244\0\144\5\2\0\12\7\1\0\7\5\1\0\7\5\1\0"+
    "\3\5\1\0\10\5\2\0\2\5\2\0\26\5\1\0\7\5\1\0"+
    "\1\5\3\0\4\5\2\0\11\5\2\0\2\5\2\0\4\5\10\0"+
    "\1\5\4\0\2\5\1\0\5\5\2\0\12\7\4\5\7\0\1\5"+
    "\5\0\3\5\1\0\6\5\4\0\2\5\2\0\26\5\1\0\7\5"+
    "\1\0\2\5\1\0\2\5\1\0\2\5\2\0\1\5\1\0\5\5"+
    "\4\0\2\5\2\0\3\5\3\0\1\5\7\0\4\5\1\0\1\5"+
    "\7\0\12\7\6\5\13\0\3\5\1\0\11\5\1\0\3\5\1\0"+
    "\26\5\1\0\7\5\1\0\2\5\1\0\5\5\2\0\12\5\1\0"+
    "\3\5\1\0\3\5\2\0\1\5\17\0\4\5\2\0\12\7\1\0"+
    "\1\5\17\0\3\5\1\0\10\5\2\0\2\5\2\0\26\5\1\0"+
    "\7\5\1\0\2\5\1\0\5\5\2\0\11\5\2\0\2\5\2\0"+
    "\3\5\10\0\2\5\4\0\2\5\1\0\5\5\2\0\12\7\1\0"+
    "\1\5\20\0\2\5\1\0\6\5\3\0\3\5\1\0\4\5\3\0"+
    "\2\5\1\0\1\5\1\0\2\5\3\0\2\5\3\0\3\5\3\0"+
    "\14\5\4\0\5\5\3\0\3\5\1\0\4\5\2\0\1\5\6\0"+
    "\1\5\16\0\12\7\11\0\1\5\7\0\3\5\1\0\10\5\1\0"+
    "\3\5\1\0\27\5\1\0\12\5\1\0\5\5\3\0\10\5\1\0"+
    "\3\5\1\0\4\5\7\0\2\5\1\0\2\5\6\0\4\5\2\0"+
    "\12\7\22\0\2\5\1\0\10\5\1\0\3\5\1\0\27\5\1\0"+
    "\12\5\1\0\5\5\2\0\11\5\1\0\3\5\1\0\4\5\7\0"+
    "\2\5\7\0\1\5\1\0\4\5\2\0\12\7\1\0\2\5\17\0"+
    "\2\5\1\0\10\5\1\0\3\5\1\0\51\5\2\0\10\5\1\0"+
    "\3\5\1\0\5\5\10\0\1\5\10\0\4\5\2\0\12\7\12\0"+
    "\6\5\2\0\2\5\1\0\22\5\3\0\30\5\1\0\11\5\1\0"+
    "\1\5\2\0\7\5\3\0\1\5\4\0\6\5\1\0\1\5\1\0"+
    "\10\5\22\0\2\5\15\0\72\5\4\0\20\5\1\0\12\7\47\0"+
    "\2\5\1\0\1\5\2\0\2\5\1\0\1\5\2\0\1\5\6\0"+
    "\4\5\1\0\7\5\1\0\3\5\1\0\1\5\1\0\1\5\2\0"+
    "\2\5\1\0\15\5\1\0\3\5\2\0\5\5\1\0\1\5\1\0"+
    "\6\5\2\0\12\7\2\0\2\5\42\0\1\5\27\0\2\5\6\0"+
    "\12\7\13\0\1\5\1\0\1\5\1\0\1\5\4\0\12\5\1\0"+
    "\44\5\4\0\24\5\1\0\22\5\1\0\44\5\11\0\1\5\71\0"+
    "\100\5\12\7\6\0\100\5\12\7\4\5\2\0\46\5\12\0\53\5"+
    "\1\0\1\5\3\0\u0149\5\1\0\4\5\2\0\7\5\1\0\1\5"+
    "\1\0\4\5\2\0\51\5\1\0\4\5\2\0\41\5\1\0\4\5"+
    "\2\0\7\5\1\0\1\5\1\0\4\5\2\0\17\5\1\0\71\5"+
    "\1\0\4\5\2\0\103\5\2\0\3\5\40\0\20\5\20\0\125\5"+
    "\14\0\u026c\5\2\0\21\5\1\0\32\5\5\0\113\5\3\0\3\5"+
    "\17\0\15\5\1\0\7\5\13\0\25\5\13\0\24\5\14\0\15\5"+
    "\1\0\3\5\1\0\2\5\14\0\124\5\3\0\1\5\3\0\3\5"+
    "\2\0\12\7\41\0\3\5\2\0\12\7\6\0\130\5\10\0\53\5"+
    "\5\0\106\5\12\0\35\5\3\0\14\5\4\0\14\5\12\0\12\7"+
    "\36\5\2\0\5\5\13\0\54\5\4\0\32\5\6\0\12\7\46\0"+
    "\34\5\4\0\77\5\1\0\35\5\2\0\1\5\12\7\6\0\12\7"+
    "\15\0\1\5\130\0\114\5\4\0\12\7\21\0\11\5\14\0\53\5"+
    "\3\0\2\5\12\7\6\0\64\5\14\0\70\5\10\0\12\7\3\0"+
    "\3\5\12\7\44\5\122\0\3\5\1\0\37\5\15\0\347\5\25\0"+
    "\u011a\5\2\0\6\5\2\0\46\5\2\0\6\5\2\0\10\5\1\0"+
    "\1\5\1\0\1\5\1\0\1\5\1\0\37\5\2\0\65\5\1\0"+
    "\7\5\1\0\1\5\3\0\3\5\1\0\7\5\3\0\4\5\2\0"+
    "\6\5\4\0\15\5\5\0\3\5\1\0\7\5\16\0\5\5\32\0"+
    "\5\5\20\0\2\5\23\0\1\5\13\0\5\5\5\0\6\5\1\0"+
    "\1\5\15\0\1\5\20\0\15\5\3\0\32\5\26\0\15\5\4\0"+
    "\1\5\3\0\14\5\21\0\1\5\4\0\1\5\2\0\12\5\1\0"+
    "\1\5\3\0\5\5\6\0\1\5\1\0\1\5\1\0\1\5\1\0"+
    "\4\5\1\0\13\5\2\0\4\5\5\0\5\5\4\0\1\5\21\0"+
    "\51\5\u0a77\0\57\5\1\0\57\5\1\0\205\5\6\0\7\5\16\0"+
    "\46\5\12\0\66\5\11\0\1\5\17\0\30\5\11\0\7\5\1\0"+
    "\7\5\1\0\7\5\1\0\7\5\1\0\7\5\1\0\7\5\1\0"+
    "\7\5\1\0\7\5\1\0\40\5\57\0\1\5\u01d5\0\3\5\31\0"+
    "\17\5\1\0\5\5\2\0\5\5\4\0\126\5\2\0\2\5\2\0"+
    "\3\5\1\0\132\5\1\0\4\5\5\0\51\5\3\0\136\5\21\0"+
    "\33\5\65\0\20\5\u0200\0\u19b6\5\112\0\u51cc\5\64\0\u048d\5\103\0"+
    "\56\5\2\0\u010d\5\3\0\20\5\12\7\2\5\24\0\60\5\14\0"+
    "\2\5\1\0\31\5\10\0\122\5\45\0\11\5\2\0\147\5\2\0"+
    "\4\5\1\0\2\5\16\0\12\5\120\0\56\5\20\0\1\5\7\0"+
    "\64\5\14\0\105\5\13\0\12\7\6\0\30\5\3\0\1\5\4\0"+
    "\12\7\44\5\2\0\44\5\14\0\35\5\3\0\101\5\16\0\1\5"+
    "\12\7\46\0\67\5\11\0\16\5\2\0\12\7\6\0\27\5\3\0"+
    "\2\5\4\0\103\5\30\0\3\5\43\0\6\5\2\0\6\5\2\0"+
    "\6\5\11\0\7\5\1\0\7\5\221\0\53\5\1\0\2\5\2\0"+
    "\12\7\6\0\u2ba4\5\14\0\27\5\4\0\61\5\u2104\0\u012e\5\2\0"+
    "\76\5\2\0\152\5\46\0\7\5\14\0\5\5\5\0\14\5\1\0"+
    "\15\5\1\0\5\5\1\0\1\5\1\0\2\5\1\0\2\5\1\0"+
    "\154\5\41\0\u016b\5\22\0\100\5\2\0\66\5\50\0\15\5\3\0"+
    "\20\5\20\0\7\5\14\0\2\5\30\0\3\5\31\0\1\5\6\0"+
    "\5\5\1\0\207\5\2\0\1\5\4\0\1\5\13\0\12\7\7\0"+
    "\32\5\4\0\1\5\1\0\32\5\13\0\131\5\3\0\6\5\2\0"+
    "\6\5\2\0\6\5\2\0\3\5\3\0\2\5\3\0\2\5\22\0"+
    "\3\5\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\3\1\1\2\1\3\1\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\1\1\0\1\4"+
    "\1\0\1\4";

  private static int [] zzUnpackAction() {
    int [] result = new int[20];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\16\0\34\0\52\0\16\0\70\0\106\0\124"+
    "\0\16\0\16\0\16\0\16\0\16\0\16\0\142\0\142"+
    "\0\52\0\160\0\176\0\176";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[20];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\2\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\17\0\1\17"+
    "\1\20\1\21\13\0\2\17\1\21\17\0\1\6\1\0"+
    "\1\6\15\0\1\22\13\0\1\6\1\0\1\10\1\23"+
    "\1\24\5\0\3\17\21\0\1\22\1\23\1\24\13\0"+
    "\1\22\2\23\4\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[140];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\3\1\6\11\2\1\1\0"+
    "\1\1\1\0\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[20];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
  private StringBuffer string = new StringBuffer();
  
  private String originId;
  
  /** 
   * Resets scanner.
   */    
  public void reset(java.io.Reader reader, String originId) {
    this.originId = originId;
    yyreset(reader);
  }
  
  /**
   * {@inheritDoc}
   */
  public void close() throws java.io.IOException {
    yyclose();
  }



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  TextScanner(java.io.Reader in, String originId) {
  	this.originId = originId;
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  TextScanner(java.io.InputStream in, String originId) {
    this(new java.io.InputStreamReader(in), originId);
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1864) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public TextToken getNextToken() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 10: 
          { return new TextToken(ETokenType.COLON, yychar, yyline, yytext(), originId);
          }
        case 12: break;
        case 6: 
          { return new TextToken(ETokenType.DOT, yychar, yyline, yytext(), originId);
          }
        case 13: break;
        case 8: 
          { return new TextToken(ETokenType.QUESTION, yychar, yyline, yytext(), originId);
          }
        case 14: break;
        case 9: 
          { return new TextToken(ETokenType.SEMICOLON, yychar, yyline, yytext(), originId);
          }
        case 15: break;
        case 4: 
          { return new TextToken(ETokenType.NUMBER_WORD, yychar, yyline, yytext(), originId);
          }
        case 16: break;
        case 1: 
          { /* ignore */
          }
        case 17: break;
        case 2: 
          { yyline -= 1;
          }
        case 18: break;
        case 11: 
          { return new TextToken(ETokenType.MULTIPLE_EOL, yychar, yyline, yytext(), originId);
          }
        case 19: break;
        case 3: 
          { return new TextToken(ETokenType.WORD, yychar, yyline, yytext(), originId);
          }
        case 20: break;
        case 5: 
          { return new TextToken(ETokenType.COMMA, yychar, yyline, yytext(), originId);
          }
        case 21: break;
        case 7: 
          { return new TextToken(ETokenType.EXCLAMATION, yychar, yyline, yytext(), originId);
          }
        case 22: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              {
                return new TextToken(ETokenType.EOF, yychar, yyline, yytext(), originId);
              }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
