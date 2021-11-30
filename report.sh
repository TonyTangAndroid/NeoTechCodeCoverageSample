#!/usr/bin/env bash
./gradlew clean rootCoverageReport
open ./build/reports/jacoco/index.html
