package com.craftinginterpreters.lox;

import java.util.ArrayList;
import java.util.Hashmap;
import java.util.List;
import java.util.Map;

import static com.craftinginterpreters.lox.TokenType.*;

class Scanner {
  private final String source;
  private final List<token> tokens = new ArrayList<>();
  private int start = 0;
  private int current = 0;
  private int line = 1;

  Scanner(String source) {
    this.source = source;
  }
}

  List<Token> scanToken() {
    while(!isAtEnd()) {
      start = current;
      scanToken();
    }
  
  private boolean isAtEnd() {
    return current >= source.length();
  }


  tokens.add(new Token(EOF, "", null, line));
  return tokens;
}
