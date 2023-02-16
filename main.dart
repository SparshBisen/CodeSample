import 'package:flutter/material.dart';
import 'package:flutter_create_guide/questions.dart';
// import './questions.dart';
import './answer.dart';
// void main() {
//   runApp(Myapp());
// }

void main() => runApp(MyApp());

class MyApp extends StatefulWidget {
  //ignore: prefer_const_constructors_in_immutables
  MyApp({super.key});

  @override
  State<StatefulWidget> createState() {
    // ignore: todo
    // TODO: implement createState
    return _MyAppState();
  }
}

class _MyAppState extends State<MyApp> {
  var _questionIndex = 0;
  void _answerQuestion() {
    setState(() {
      _questionIndex = _questionIndex + 1;
    });
    // ignore: avoid_print
    print(_questionIndex);
  }

  @override
  Widget build(BuildContext context) {
    // ignore: unnecessary_const
    const questions = const [
      {
        // this " {} " are the short form of intialising the MAPS
        // Lecture No. 45
        'quetionsText': 'What is your fav color?', // String 1
        'answer': ['Black', 'Red', 'White', 'Green'], // List 1
      },
// Here the maps contains the list for the questions and this
// is to be called in the main file.
      {
        'quetionsText': 'What is your fav Animal?', // String 2
        'answer': ['Dog', 'Rabbit', 'Tiger', 'Lion'], // List 2
      },
      {
        'quetionsText': 'What is your fav Constructor?', // String 3
        'answer': ['Family', 'Max', 'Sparsh', 'Kunal'], // List 3
      }
    ];

    // questions = [];  // this will not work if questions is const.

    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('My First App'),
        ),
        body: Column(
          children: [
            Question(
              questions[_questionIndex]['quetionsText'],
            ),
            ...(questions[_questionIndex]['answer'] as List<String>)
                .map((answer) {
              return Answer(_answerQuestion, answer);
            }).toList()
          ],
        ),
      ),
    );
  }
}
