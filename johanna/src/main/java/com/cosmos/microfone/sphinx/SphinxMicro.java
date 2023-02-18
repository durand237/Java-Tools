package com.cosmos.microfone.sphinx;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
//assign me
/*
 * function static
 * convert the voice to a text
 */

public class SphinxMicro {

  static String RELATIVE_MODEL_PATH = "resource:/edu/cmu/sphinx/models/en-us/en-us";

  static String RELATIVE_DICTIONARY_PATH =
      "resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict";

  static String RELATIVE_LANGUAGE_PATH = "resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin";

  public static void main(String[] args) throws Exception {
    Configuration configuration = new Configuration();
    configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
    configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
    configuration.setLanguageModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin");

    LiveSpeechRecognizer recognizer = new LiveSpeechRecognizer(configuration);
    recognizer.startRecognition(true);
    System.out.println("Speak now.");
    while (true) {
      String hypothesis = recognizer.getResult().getHypothesis();
      System.out.println("You said: " + hypothesis);
    }
  }
}
