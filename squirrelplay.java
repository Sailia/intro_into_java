public boolean squirrelPlay(int temp, boolean isSummer) {
  if (isSummer && temp >= 90 && temp <= 100)
  {
    return true;
  }
  else if (temp >= 60 && temp <= 90)
  {
    return true;
  }
  else
  {
    return false;
  }
}