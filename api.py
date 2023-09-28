# Implimenting the Restfull api usign flask micro server

from flask import Flask

app = Flask(__name__)

@app.route("/")
def question1():
  return "Hello world!"

if __name__=='__main__':
  app.run(debug=True, host='0.0.0.0')
