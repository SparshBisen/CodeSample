// ignore_for_file: unused_import

import 'package:flutter/cupertino.dart';
import './questions.dart';

class Question extends StatelessWidget {
  final String questionText;
// here final will command that the final value of the question in this call
// will never change, hence this particular section will not be mutable.
  Question(this.questionText);

  @override
  Widget build(BuildContext context) {
    return Container(
      width: double.infinity,
      margin: EdgeInsets.all(10),
      child: Text(
        questionText,
        style: TextStyle(fontSize: 28),
        textAlign: TextAlign.center,
      ),
    );
  }
}
