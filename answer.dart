import 'package:flutter/material.dart';
// import './main.dart';

class Answer extends StatelessWidget {
  final void Function() selectHandler;
  final String answerText;
  Answer(this.selectHandler, this.answerText);

  @override
  Widget build(BuildContext context) {
    return Container(
      width: double.infinity,
      child: ElevatedButton(
        style: ButtonStyle(
          backgroundColor: MaterialStateProperty.all(Colors.red),
        ),
        onPressed: selectHandler,
        child: Text(
          (answerText),
          style: TextStyle(color: Colors.white),
        ),
      ),
    );
  }
}
